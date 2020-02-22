package com.krypton.mongo.services;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.krypton.mongo.connection.DBConnection;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
@Component
public class MongoDBService {
	@Resource
	private DBConnection mongoDBConnection;
	private MongoDatabase database;
	
	public MongoDBService(DBConnection dbConnection) {
		this.mongoDBConnection=dbConnection;
	}
	public void init() {
		mongoDBConnection.connect();
		MongoClient mongoClient=MongoClients.create();
		Properties properties=new Properties();
		try {
			properties.load(new ClassPathResource("application.properties").getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		database=mongoClient.getDatabase(properties.getProperty("db.database"));
	    
		
	}
	public MongoCollection<Document> getCollection(String collectionName) {
		init();
		return database.getCollection(collectionName);
	}
	public FindIterable<Document> findAll(String collectionName) {
		return getCollection(collectionName).find();		
	}
	public void insert(Document document,String collectionName) {
		getCollection(collectionName).insertOne(document);
	}
	public void remove(Bson bsonFilter,String collectionName) {
		getCollection(collectionName).deleteOne(bsonFilter);
	}
	public void update(String collectionName,Bson filter,Bson update) {
		getCollection(collectionName).updateOne(filter, update);
	}
	public Document find(String collectionName,Bson filter) {
		return getCollection(collectionName).find(filter).first();
	}

}

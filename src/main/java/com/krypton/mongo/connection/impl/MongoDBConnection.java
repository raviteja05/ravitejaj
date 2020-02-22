package com.krypton.mongo.connection.impl;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.krypton.mongo.connection.DBConnection;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
@Component
public class MongoDBConnection implements DBConnection {
	private MongoClient mongoClient; 


	@Override
	public void connect() {
		Properties properties=new Properties();
		try {
			properties.load(new ClassPathResource("application.properties").getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mongoClient=MongoClients.create(properties.getProperty("db.url"));
		
	}

	@Override
	public void closeConnection() {
		mongoClient.close();
		
	}
	
	

}

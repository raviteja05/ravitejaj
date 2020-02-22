package com.krypton.mongo.services;

import javax.annotation.Resource;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MongoDaoService<T> {
	@Resource
	private MongoDBService mongoDBService;
	public void save(T object) {
		ObjectMapper obj=new ObjectMapper();
		String json = null;
		try {
			json = obj.writeValueAsString(object);
			mongoDBService.insert(Document.parse(json), object.getClass().getSimpleName().toLowerCase());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Document find(Bson filter,String collectionName) {
		return mongoDBService.find(collectionName, filter);
	}

}

package com.krypton.mongo.connection;


public interface DBConnection {
	
	void connect();
	
	void closeConnection();

}

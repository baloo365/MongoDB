package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class MongoDBTes3_insert2 {
	
	public static void main(String[] args) {
		// 1. 몽고db 프로그램에 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. 몽고db 프로그램에 연결 성공.");
		// 2. shop2 db로 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 db로 연결 성공.");

		// 3. memo 컬렉션에 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memeber 컬렉션에 연결 성공.");

		Document doc = new Document();
		doc.append("name", "song");
		doc.append("age", 500);
		doc.append("office", "busan");
		doc.append("phone", "011");
		
		collection.insertOne(doc);
		System.out.println("4. memeber 컬렉션에 insertOne 성공.");

		
	}

}
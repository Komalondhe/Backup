package com.Day28;

import java.sql.Connection;
public class SingltoneDatabaseConnection {
	private static SingltoneDatabaseConnection instanceConnection;
	private SingltoneDatabaseConnection() {
		Connection=createConnection();
	}
	private String createConnection() {
		return "Database Connection establish";
	}
	private String Connection;
	public static synchronized SingltoneDatabaseConnection getInstance() {
		if(instanceConnection==null) {
			instanceConnection=new SingltoneDatabaseConnection();
		}
		return instanceConnection;
	}
	public String getConnection() {
		return Connection;
	}
	

	public static void main(String[] args) {
		SingltoneDatabaseConnection db1=SingltoneDatabaseConnection.getInstance();
		SingltoneDatabaseConnection db2=SingltoneDatabaseConnection.getInstance();
		
		System.out.println(db1.getConnection());
		System.out.println(db2.getConnection());
		
		System.out.println(db1==db2);

		


	}

}

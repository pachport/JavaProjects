package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	static Connection connection = null;
	
	public static Connection connectToDB() {

		if (connection != null) {
			return connection;
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exercise", "root","root");
			} catch (Exception e) {
				System.out.println(e);
			}
			return connection;

		}
	}	

}

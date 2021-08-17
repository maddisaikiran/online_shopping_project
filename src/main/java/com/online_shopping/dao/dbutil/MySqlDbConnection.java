package com.online_shopping.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {

	private static Connection connection;
    private MySqlDbConnection() {
		
	}
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url="jdbc:mysql://localhost:3306/revature_mass_india";
		String user="root";
		String password="Keerthana123@";
	     connection = DriverManager.getConnection(url, user, password);
	   //	System.out.println("connection established");
		return connection;
	}
}

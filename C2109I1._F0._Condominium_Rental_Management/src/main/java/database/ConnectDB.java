package database;

import java.sql.*;

public class ConnectDB {

	public static Connection connection= null;
	
	public static String url = "jdbc:sqlserver://";
	public static String serverName = "DESKTOP-6G7ENHE\\SQLEXPRESS";
	public static String portNumber ="1433";
	public static String databaseName ="Condominium_Rental_Management";
	public static String username ="sa";
	public static String password ="1";
	
	public static String getConnnectionUrl() {
		return url + serverName + ":" + portNumber + ";databaseName=" 
				 + databaseName + "; user =" +username 
				 + " ;password=" + password ;
	}
	
	public static Connection getConnect() {
		try {
			connection = DriverManager.getConnection(getConnnectionUrl());
		}catch(Exception e) {
			e.printStackTrace();
			connection= null;
		}
		return connection;
	}

	
}

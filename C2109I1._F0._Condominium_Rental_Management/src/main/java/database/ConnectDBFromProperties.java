package database;


import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectDBFromProperties {
	
	public static String getConnectuonURLFromClassPath() {
		String strCon = null;
		
		try(
				InputStream file = ConnectDBFromProperties
								 .class.getClassLoader()
								 .getResourceAsStream("db.properties");
				
//				InputStream file = FileInputStream("dbb.properties");
				
			) {
			Properties prop = new Properties();
			prop.load(file);
			strCon = prop.getProperty("url")+prop.getProperty("serverName")
					+":"+prop.getProperty("portNumber")+";"
					+"databaseName="+prop.getProperty("databaseName")+";"
					+"user="+prop.getProperty("username")+";"
					+"password="+prop.getProperty("password");
			
		} catch (Exception e) {
			e.printStackTrace();
			strCon = null;
		}
		
		return strCon;
	}
	private static InputStream FileInputStream(String string) {
	// TODO Auto-generated method stub
	return null;
}
	public static Connection getConnectioFromClassPath() {
		Connection connect = null;
		try {
			connect = DriverManager
					.getConnection(getConnectuonURLFromClassPath());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connect;
	}
}
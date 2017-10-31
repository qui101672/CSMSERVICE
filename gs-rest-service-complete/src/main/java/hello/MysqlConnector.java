package hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnector {
	public static final String URI = "jdbc:mysql://vgnet.ddns.ms:3306/";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "1234";
	public static final String DBNAME = "ddm";
	
	public static Connection conn;
	
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URI + DBNAME, USERNAME, PASSWORD);
			System.out.println("Connected!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

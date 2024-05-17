package code.microsystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOConnection {
private static Connection connection=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","Pass@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}

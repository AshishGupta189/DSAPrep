package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutil {
	public static Connection provideconnection() {
		Connection conn=null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sb101_Web20";
		
		try {
			conn=DriverManager.getConnection(url, "root", "ashish189");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return conn;
	}
}

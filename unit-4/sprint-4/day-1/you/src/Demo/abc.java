package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/sb101_web20";
		
		try {
			Connection conn=DriverManager.getConnection(url,"root","ashish189");
			System.out.println(conn.getClass().getName());
			if(conn!=null) {
				System.out.println("connected");
			}else {
				System.out.println("not connected");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

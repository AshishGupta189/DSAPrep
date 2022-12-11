package Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Problem2 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/sb101_web20";
		
		try (Connection conn=DriverManager.getConnection(url, "root", "ashish189")){
			
			java.sql.Statement ps=conn.createStatement();
			PreparedStatement p=conn.prepareStatement("insert into product values(?,?,?,?)");
			for(int i=0;i<5;i++) {
				System.out.println("Enter "+" "+i+1+" "+"product details id,name,quant,price");
				p.setInt(1,sc.nextInt());
				p.setString(2, sc.next());
				p.setInt(3, sc.nextInt());
				p.setString(4, sc.next());
				p.executeUpdate();
			}
			
			p.setInt(1, 15);
			p.setString(2, "ghjj");
			p.setInt(3, 0);
			p.setString(4, null);
			p.execute();
			
			p.execute("update product set quantity=30,price=3000 where pid=15");
			p.execute("delete from product where quantity<=2");
			
			boolean a=ps.execute("create table product(pid int primary key,pname varchar(20) not null,quantity int, price int)");
			System.out.println(a);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

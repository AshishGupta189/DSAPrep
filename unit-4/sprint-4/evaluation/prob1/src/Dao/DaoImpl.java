package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utility.dbutil;
import obj.Employee;
import obj.department;

public class DaoImpl implements DaoInterface{

	@Override
	public String adddepartment(int did, String name, String location) {
		
		String message = "Not Inserted...";
		
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into department values(?,?,?)");
			
			ps.setInt(1, did);
			ps.setString(2, name);
			ps.setString(3, location);
			
			int x=  ps.executeUpdate();
			
			if(x > 0)
				message = "Inserted new Department";
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String registerempwithoutid(int id, String name, String loc, String email, String pass, int salary) {
		String message = "Not Inserted...";
		
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into employee values(?,?,?,?,?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, loc);
			ps.setString(4, email);
			ps.setString(5, pass);
			ps.setInt(6, salary);
			ps.setInt(7,0);
			
			int x=  ps.executeUpdate();
			
			if(x > 0)
				message = "Inserted new Employee";
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public Employee login(String email, String password) {
		Employee emp=null;
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where email=? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet x=  ps.executeQuery();
			
			if(x.next()) {
				emp=new Employee(x.getInt("empid"), x.getString("ename"),x.getString("address"),x.getString("email"),x.getString("password"),x.getInt("salary"),x.getInt("deptid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<department> deptdetails() {
		List<department> list= new ArrayList<>();
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from department");
			
			ResultSet x=  ps.executeQuery();
			
			if(x.next()) {
			department d=new department(x.getInt("did"),x.getString("dname"), x.getString("location"));
			
			list.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return list;
	}

	@Override
	public String updatelocation(int id,String s) {
		String message = "User not found";
		
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("update department set location=? where did=?");
			
			ps.setString(1, s);
			ps.setInt(2, id);
			
			
			int x=  ps.executeUpdate();
			
			if(x > 0)
				message = "Updated dept location";
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
	}

	@Override
	public String updatepass(int id, String s) {
		String message = "User not found";
		
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("update employee set password=? where empid=?");
			
			ps.setString(1, s);
			ps.setInt(2, id);
			
			
			int x=  ps.executeUpdate();
			
			if(x > 0)
				message = "Updated employee password";
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;

	}

	
	

}

package Dao;

import java.util.List;

import obj.Employee;
import obj.department;

public interface DaoInterface {

	public String adddepartment(int did,String name,String location);
	
	public String registerempwithoutid(int id,String name,String loc,String email,String pass,int salary);
	
	public Employee login(String email,String password);
	
	public List<department> deptdetails();
	
	public String updatelocation(int id,String s);
	
	public String updatepass(int id,String s);
	
}

package evaluation;

import java.util.Scanner;

import Dao.DaoImpl;

public class adddpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter deptid :");
		int id= sc.nextInt();
		
		System.out.println("Enter deptName :");
		String name= sc.next();
		
		System.out.println("Enter location :");
		String location= sc.next();
		
		
		DaoImpl dao = new DaoImpl();
		
		String result= dao.adddepartment(id, name, location);
		
		System.out.println(result);
	}
	
}

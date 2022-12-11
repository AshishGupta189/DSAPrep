package evaluation;

import java.util.Scanner;

import Dao.DaoImpl;

public class empwithoutid {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		
		System.out.println("Enter empName :");
		String name= sc.next();
		
		System.out.println("Enter location :");
		String location= sc.next();
		
		System.out.println("Enter email :");
		String email= sc.next();
		
		System.out.println("Enter pass :");
		String pass= sc.next();
		
		System.out.println("Enter salary :");
		int salary= sc.nextInt();
		
		DaoImpl dao = new DaoImpl();
		
		String result= dao.registerempwithoutid(id, name, location, email, pass, salary);
		
		System.out.println(result);
	}
}

package evaluation;

import java.util.Scanner;

import Dao.DaoImpl;
import obj.Employee;

public class login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email :");
		String name= sc.next();
		
		System.out.println("Enter password :");
		String location= sc.next();
		
		
		DaoImpl dao = new DaoImpl();
		
		Employee result= dao.login(name, location);
		if(result!=null) {
			System.out.println("welcome");
		}
		System.out.println(result);
	}
}

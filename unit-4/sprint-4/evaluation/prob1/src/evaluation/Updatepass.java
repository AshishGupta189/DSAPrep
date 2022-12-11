package evaluation;

import java.util.Scanner;

import Dao.DaoImpl;

public class Updatepass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empid :");
		int id= sc.nextInt();
		
		
		System.out.println("Enter password :");
		String location= sc.next();
		
		
		DaoImpl dao = new DaoImpl();
		
		String result= dao.updatepass(id, location);
		
		System.out.println(result);
	}
	
}

package evaluation;

import java.util.Scanner;

import Dao.DaoImpl;

public class updatedeptloc {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter deptid :");
		int id= sc.nextInt();
		
		
		System.out.println("Enter location :");
		String location= sc.next();
		
		
		DaoImpl dao = new DaoImpl();
		
		String result= dao.updatelocation(id, location);
		
		System.out.println(result);
	}
}

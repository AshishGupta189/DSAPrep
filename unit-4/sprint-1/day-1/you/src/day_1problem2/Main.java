package day_1problem2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Empid e1=new Empid();
	EmpAddress e2=new EmpAddress();
	Empsalary e3=new Empsalary();
	System.out.println("Enter number between 1 to 3");
	int s=sc.nextInt();
	if(s==1) {
		TreeSet<Employee> emp=new TreeSet<>(e1);
		emp.add(new Employee(1,"Ashish",50000,"Ayodhya"));
		emp.add(new Employee(2,"Abhay",40000,"Assam"));
		emp.add(new Employee(4,"Surya",46000,"Lucknow"));
		emp.add(new Employee(3,"Abhi",42000,"Bengal"));
		
		emp.add(new Employee(5,"Bebo",55000,"Ayodhya"));
		emp.add(new Employee(6,"Jigra",48000,"Delhi"));
		for(Employee e:emp) {
			System.out.println(e);
		}
	}else if(s==2) {
		TreeSet<Employee> emp=new TreeSet<>(e2);
		emp.add(new Employee(1,"Ashish",50000,"Ayodhya"));
		emp.add(new Employee(2,"Abhay",40000,"Assam"));
		emp.add(new Employee(4,"Surya",46000,"Lucknow"));
		emp.add(new Employee(3,"Abhi",42000,"Bengal"));
		
		emp.add(new Employee(5,"Bebo",55000,"Ayodhya"));
		emp.add(new Employee(6,"Jigra",48000,"Delhi"));
		for(Employee e:emp) {
			System.out.println(e);
		}
	}else if(s==3) {
		TreeSet<Employee> emp=new TreeSet<>(e3);
		emp.add(new Employee(1,"Ashish",50000,"Ayodhya"));
		emp.add(new Employee(2,"Abhay",40000,"Assam"));
		emp.add(new Employee(4,"Surya",46000,"Lucknow"));
		emp.add(new Employee(3,"Abhi",42000,"Bengal"));
		
		emp.add(new Employee(5,"Bebo",55000,"Ayodhya"));
		emp.add(new Employee(6,"Jigra",48000,"Delhi"));
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		sc.close();
	}
	
	
	
	
	
}
}

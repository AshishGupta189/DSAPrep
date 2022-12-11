package prob2;

import java.util.*;

public class Main {
	/*
	 * Q2/- Create a List of 5 Student objects and from that List get the highest
	 * marks Student by using Stream API.
	 */
	
	
	public static void main(String[] args) {
		List<Student> stu=new ArrayList<>();
		stu.add(new Student(1, "Ritu", 450));
		stu.add(new Student(2, "Akhil", 420));
		stu.add(new Student(3, "Anil", 290));
		stu.add(new Student(4, "Riya", 290));
		stu.add(new Student(5, "Ashu", 440));
		
		
		Optional opt=      stu.stream().max((s1,s2)->s1.getMarks()-s2.getMarks());
		Student s=(Student) opt.get();
		System.out.println(s);
		
	}

}

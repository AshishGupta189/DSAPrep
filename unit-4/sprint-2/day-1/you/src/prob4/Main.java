package prob4;

import java.util.*;
import java.util.stream.Collectors;

import prob2.Student;

public class Main {
	/*
	 * Q4/ Create a Set of 5 Student objects and from that set filter those students
	 * whose marks is less than 500 and put all the filtered Student object inside
	 * another Set object. Note: make sure that there should not be any duplicate
	 * Student object.`
	 */
	
	public static void main(String[] args) {
		Set<Student> stu=new HashSet<>();
		stu.add(new Student(1, "Ritu", 550));
		stu.add(new Student(1, "Ritu", 550));
		stu.add(new Student(2, "Akhil", 420));
		stu.add(new Student(3, "Anil", 290));
		stu.add(new Student(4, "Riya", 590));
		stu.add(new Student(5, "Ashu", 440));
		
		
		
		
		
		Set<Student> filtlist=stu.stream().filter(s->s.getMarks()<500).collect(Collectors.toSet());
		filtlist.forEach(s->System.out.println(s));
	}
}

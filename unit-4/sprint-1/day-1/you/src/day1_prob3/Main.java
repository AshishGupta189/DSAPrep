package day1_prob3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		sortmarks s=new sortmarks();
		TreeSet<Student> stu=new TreeSet<>(s);
		stu.add(new Student(1, "Ritu", 450, "Ayodhya"));
		stu.add(new Student(2, "Akhil", 420, "Delhi"));
		stu.add(new Student(3, "Anil", 290, "Patna"));
		stu.add(new Student(4, "Riya", 290, "Lucknow"));
		stu.add(new Student(5, "Ashu", 440, "NCR"));
		
		for(Student s1:stu) {
			System.out.println(s1.getName());
		}
	}
}

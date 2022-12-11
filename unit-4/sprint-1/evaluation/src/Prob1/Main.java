package Prob1;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
public class Main {
	/*
	 * Q1/- Write the implementations of all the following Functional interfaces
	 * with examples using the Lamda expression. Predicate<Student>: if the
	 * student's marks is less than 500 Consumer:<Student>: print the student's
	 * details Supplier<Student>: get the Student object with all details(roll,
	 * name, marks) Function<String, Integer>: Get any number in String format and
	 * return the number in Integer format.
	 */
	
	public static void main(String[] args) {
		Predicate<Student> p1= s -> s.getMarks()<500;
		System.out.println(p1.test(new Student(1,"Ahay",490)));
		
		
		Consumer<Student> c1= s -> {
			System.out.println("Roll is: "+s.getRoll());
			System.out.println("Name is : "+s.getName());
			System.out.println("Marks is : "+s.getMarks());
		};
		c1.accept(new Student(2,"Ashi",240));
		
		
		Supplier<Student> s1= () -> new Student(10,"Nikhil",670); 
		System.out.println(s1.get());
		
		Function<String,Integer> f1= s -> Integer.parseInt(s);
		int x=f1.apply("1658");
		System.out.println(x+10);
		}

}

package prob2;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
public class Main {
	/*
	 * Q2/- Implement the following functional interfaces with some basic examples
	 * using Lambda expression. Predicate Supplier Consumer Function
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

package Prob1;
import java.util.function.Supplier;
public class MySupplier implements Supplier<Student> {

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		Student s1=new Student(5,"kishan",456);
		return s1;
	}

}
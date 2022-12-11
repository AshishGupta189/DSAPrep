package prob2;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student t) {
		System.out.println("Roll is :" + t.getRoll());
		System.out.println("Name is :" + t.getName());
		System.out.println("Marks is :" + t.getMarks());
	}

}

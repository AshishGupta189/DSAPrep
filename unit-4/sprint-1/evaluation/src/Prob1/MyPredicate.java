package Prob1;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student> {

	@Override
	public boolean test(Student t) {
		return t.getMarks()>700;
	}

}

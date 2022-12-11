package day1_prob3;

import java.util.Comparator;

public class sortmarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks()==o2.getMarks()) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getMarks()>o2.getMarks()? +1:-1;
		
	}

	
}

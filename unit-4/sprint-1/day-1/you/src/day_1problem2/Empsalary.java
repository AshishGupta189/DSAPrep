package day_1problem2;

import java.util.Comparator;

public class Empsalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()==o2.getSalary()) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getSalary()>o2.getSalary()? +1:-1;
	}

	
	

}

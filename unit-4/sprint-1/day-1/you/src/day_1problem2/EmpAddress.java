package day_1problem2;

import java.util.Comparator;

public class EmpAddress implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getAddress()==o2.getAddress()) {
			return 0;
		}
		return o1.getAddress().compareTo(o2.getAddress());
	}

}

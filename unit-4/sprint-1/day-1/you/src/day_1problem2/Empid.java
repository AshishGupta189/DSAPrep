package day_1problem2;

import java.util.Comparator;

public class Empid implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId()>o2.getEmpId()? +1: -1;
	}

}

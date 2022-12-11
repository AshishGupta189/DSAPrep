package prob3;

import java.util.*;

public class Main {
	/*
	 * Q3/- Implement the following interface using Lambda Expression. interface
	 * PrintList { abstract void display(List<String> city); } From the main method,
	 * call the above method by supplying a List of 5 cities.
	 */
	
	interface PrintList { abstract void display(List<String> city); }
	
	public static void main(String[] args) {
		PrintList p1=(List<String> city)->{
			System.out.println(city);
		};
		List<String> city=new ArrayList<>();
		city.add("Delhi");
		city.add("Agra");
		city.add("Ayodhya");
		city.add("Lucknow");
		city.add("Nepal");
		p1.display(city);
	}
}

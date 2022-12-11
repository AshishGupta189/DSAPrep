package Prob1;

import java.util.*;

public class Main {
//Create a List of cities and sort them in descending order using Lambda Expression.
	
	public static void main(String[] args) {
		List<String> cities=new ArrayList<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Ayodhya");
		cities.add("Jaipur");
		cities.add("Nepal");
		
		
		Collections.sort(cities,(a1,a2)->a1.compareTo(a2));
		System.out.println(cities);
	}

}

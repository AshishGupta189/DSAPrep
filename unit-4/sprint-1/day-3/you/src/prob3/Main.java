package prob3;

 import java.util.* ;
import java.util.Map.Entry;

import prob2.Student;
 
public class Main {

	/*
	 * Q3/- Sort the following Map by its value (by Student name in descending
	 * order), using Lambda expressions. In this Map key will be Country name and
	 * value will be the Student object. public Map<String, Student>
	 * sortMapUsingStudentName(Map<String, Student> originalMap); Student class roll
	 * name email marks ● Call the above method by passing a HashMap object with 5
	 * entries ● Print all the student details belonging from each country. Note: to
	 * print the details make use of the Lambda expression
	 */
	
	public static void main(String[] args) {
		Map<String,Student> team=new HashMap<>();
		team.put("India", new Student(1, "Ashish", 500));
		team.put("Australia", new Student(5, "Alex", 498));
		team.put("Canada", new Student(9, "Rio", 400));
		team.put("Japan", new Student(12, "Charlie", 390));
		team.put("USA", new Student(7, "Joseph", 472));
		System.out.println(sortMapUsingStudentName(team));
		
	}
	public static Map<String, Student> sortMapUsingStudentName(Map<String, Student> team){
	List<Map.Entry<String,Student>> list = new LinkedList<Map.Entry<String,Student>>(team.entrySet());
	
	Collections.sort(list,new Comparator <Map.Entry<String,Student>>(){

		@Override
		public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
			return o2.getValue().getName().compareTo(o1.getValue().getName());
		}
		
	});
	return team;
	}

}

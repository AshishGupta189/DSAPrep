package Prob2;

public class Main {
	/*
	 * Q2/- implement the following method of a functional interface using method
	 * reference. Interface X{ public int convetStringToNumber(String s); }
	 */
	interface X{ 
		public int convetStringToNumber(String s);
		}
	
	public static void main(String[] args) {
		X x1=Integer::parseInt;
		int s=x1.convetStringToNumber("123654");
		System.out.println(s+123);
	}
}

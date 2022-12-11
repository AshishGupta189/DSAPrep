package prob1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	/*
	 * Q1/- Create a Product bean class with the following properties: productId
	 * productName price quantity ● From the main method of the Demo class performs
	 * the following operations: 1. Create a List of 5 product objects. 2. From the
	 * product list filter the products whose quantity is more than 10 in a separate
	 * List of Products. 3. Sort the Filtered List of Products by the price in
	 * ascending order. 4. Print all the products one by one from both Lists
	 * (original list and Filtered list) Note: for filtering and printing and
	 * sorting make use of Stream or Lambda expressions.
	 */

	
	
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product(1,"Oil",1800,9));
		list.add(new Product(16,"Potato",450,15));
		list.add(new Product(58,"Deo",750,5));
		list.add(new Product(112,"Condom",500,100));
		list.add(new Product(154,"Fan",1800,1));
		
		
		 
		 List<Product> filteredlist=list.stream()
				 .filter(s->s.getProdQuantity()>10)
				 .collect(Collectors.toList());
		 
		 
		 
		 Collections.sort(filteredlist,(s1,s2)->s1.getProdPrice()-s2.getProdPrice());
		 filteredlist.forEach(s->System.out.println(s));
		 list.forEach(s->System.out.println(s));
	}
}

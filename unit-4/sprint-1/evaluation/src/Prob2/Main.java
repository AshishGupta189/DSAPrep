package Prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	/*
	 * Q2/- Consider the following bean class: Product: productId: int, productName:
	 * String price: int quantity: int ● Create a List of 6 products (Pen, Pencil,
	 * Rubber, Sharpener, Scale, Compass) ● Filter the Products whose quantity is
	 * less than 2 using Lambda Expression ● Sort the List of Products by using the
	 * price in descending order. Note: For Sorting make use of Lambda Expression. ●
	 * Print each element from the List by using Method Reference.
	 */
	
	
	public static void main(String[] args) {
		List<Product> lis=new ArrayList<>();
		lis.add(new Product(1,"Pen",15,5));
		lis.add(new Product(2,"Pencil",12,3));
		lis.add(new Product(5,"Rubber",1,1));
		lis.add(new Product(7,"Sharpener",30,10));
		lis.add(new Product(6,"Scale",5,1));
		lis.add(new Product(8,"Compass",144,12));
		
		lis.removeIf(s->s.getProdquantity()<2);
		
		Collections.sort(lis,(a1,a2)->a1.getProdPrice()<a2.getProdPrice()? +1:-1);
		lis.forEach(System.out::println);
		
	}
}

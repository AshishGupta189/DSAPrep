package Prob4;
import java.util.*;
public class Demo {
	/*
	 * Q4/- Create a Product bean class having the following properties: productId:
	 * int, productName: String, quantity: int, price: int Inside the main method of
	 * the Demo class, create a List of 5 products and sort that list by using price
	 * (in descending order) Note: for sorting, make use of the Lambda expression.
	 */
	
	public static void main(String[] args) {
		List<Product> pro=new ArrayList<>();
		pro.add(new Product(1,"Wheat",300,10));
		pro.add(new Product(5,"Rice",200,5));
		pro.add(new Product(3,"Oil",180,1));
		pro.add(new Product(4,"Deo",270,1));
		pro.add(new Product(9,"Condom",50,3));
		
		Collections.sort(pro, new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o2.getPrice()-o1.getPrice();
			}
			
		});
		System.out.println(pro);
	}
}

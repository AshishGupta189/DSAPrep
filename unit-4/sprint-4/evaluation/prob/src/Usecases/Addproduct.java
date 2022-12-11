package Usecases;

import Exception.ProductException;
import dao.daoimpl;
import obj.Product;

public class Addproduct {

	public static void main(String[] args) {
		Product p=new Product(1, "deo", 500,1);
		daoimpl dao = new daoimpl();
		
		String result;
		
		try {
			result = dao.addProduct(p);
			System.out.println(result);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

package Usecases;

import Exception.ProductException;
import dao.daoimpl;

public class getallprod {

	public static void main(String[] args) {
		daoimpl dao=new daoimpl();
		try {
			System.out.println(dao.getAllProducts());
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

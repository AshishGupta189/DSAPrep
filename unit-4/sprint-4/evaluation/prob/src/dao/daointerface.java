package dao;

import java.util.List;

import Exception.ProductException;
import obj.Product;

public interface daointerface {

	 public String addProduct(Product product) throws ProductException;
	 public List<Product> getAllProducts() throws ProductException;
	 public List<Product> getAllProductQuantityLessThan(int quantity)throws ProductException;
	 public String addProductQuantity(int productId, int Quantity)throws ProductException;
	 public String deleteProductByProductName(String pname)throws ProductException;
	 public Product getProductByProductName(String pname)throws ProductException;
	
	
}

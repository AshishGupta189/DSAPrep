package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Exception.ProductException;
import utility.dbutil;
import obj.Product;

public class daoimpl implements daointerface {

	@Override
	public String addProduct(Product product) throws ProductException {
		String message="Prouct not found";
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, product.getId());
			ps.setString(2, product.getName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4,product.getQuantity());
			
			int x=  ps.executeUpdate();
			
			if(x > 0)
				message = "Inserted new Product";
			
		} catch (SQLException e) {
			message = e.getMessage();
			throw new ProductException();
		}
		
		return message;
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> pr=new ArrayList<>();
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from product");
			
			ResultSet x=  ps.executeQuery();
			
			while(x.next()) {
				Product p=new Product(x.getInt("pid"), x.getString("pname"), x.getInt("price"), x.getInt("quantity"));
				pr.add(p);
			}
			
		} catch (SQLException e) {
			 e.getMessage();
			 throw new ProductException();
		}
		return pr;
		
	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		List<Product> pr=new ArrayList<>();
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from product where quantity<?");
			ps.setInt(1, quantity);
			ResultSet x=  ps.executeQuery();
			
			while(x.next()) {
				Product p=new Product(x.getInt("pid"), x.getString("pname"), x.getInt("price"), x.getInt("quantity"));
				pr.add(p);
			}
			
		} catch (SQLException e) {
			 e.getMessage();
			 throw new ProductException();
		}
		return pr;
	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		String message="name not found";
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("delete from product where pname=?");
			
			ps.setString(1, pname);
			
			int x=  ps.executeUpdate();
			if(x>0) {
				message="deleted product";
			}
			else {
				throw new ProductException();
			}
			
			
			
		} catch (SQLException e) {
			 e.getMessage();
			 throw new ProductException();
		}
		return message;
	}

	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		Product p=null;
		try (Connection conn= dbutil.provideconnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from product where pname=?");
			
			ps.setString(1, pname);
			
			ResultSet x=  ps.executeQuery();
			if(x.next()) {
				p=new Product(x.getInt("pid"), pname,x.getInt("price"), x.getInt("quantity"));
			}
			else {
				throw new ProductException();
			}
			
			
			
		} catch (SQLException e) {
			 e.getMessage();
			 throw new ProductException();
		}
		return p;
	}

}

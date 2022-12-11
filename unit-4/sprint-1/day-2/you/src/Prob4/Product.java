package Prob4;

public class Product {
	private int productid;
	private String pname;
	private int price;
	private int quantity;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int productid, String pname, int price, int quantity) {
		super();
		this.productid = productid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(){}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
}

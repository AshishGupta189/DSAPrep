package Prob2;

public class Product {
 
	private int prodId;
	private String prodName;
	private int prodPrice;
	private int prodquantity;
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodquantity="
				+ prodquantity + "]";
	}
	public Product() {}
	public Product(int prodId, String prodName, int prodPrice, int prodquantity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodquantity = prodquantity;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdquantity() {
		return prodquantity;
	}
	public void setProdquantity(int prodquantity) {
		this.prodquantity = prodquantity;
	}
}

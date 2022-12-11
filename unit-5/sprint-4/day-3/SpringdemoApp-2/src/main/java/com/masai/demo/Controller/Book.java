package com.masai.demo.Controller;

public class Book {

	private Integer boook_Id;
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private Integer price;
	private String author_no;
	public Book(Integer boook_Id, String name, String author, String publication, String category, Integer pages,
			Integer price, String author_no) {
		super();
		this.boook_Id = boook_Id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.author_no = author_no;
	}
	@Override
	public String toString() {
		return "Book [boook_Id=" + boook_Id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", author_no=" + author_no + "]";
	}
	public Integer getBoook_Id() {
		return boook_Id;
	}
	public void setBoook_Id(Integer boook_Id) {
		this.boook_Id = boook_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAuthor_no() {
		return author_no;
	}
	public void setAuthor_no(String author_no) {
		this.author_no = author_no;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}

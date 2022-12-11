package com.masai.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	private List<Book> books=new ArrayList<>();
	
	@PostConstruct
	public void addbooks() {
		books.add(new Book(101,"C++","Nitesh","Rajput Publication","Computer Programming",1500,240,"G254"));
		books.add(new Book(201,"Java","Jaya","Jaya Publication","Computer Programming",1400,210,"G265"));
		books.add(new Book(301,"Python","Ritu","Ritu Publication","Computer Programming",1200,320,"G226"));
		books.add(new Book(401,"JS","Ashish","Tiwari Publication","Computer Programming",1800,180,"G236"));
		books.add(new Book(501,"C#","Rahul","Rahul Publication","Computer Programming",1950,190,"G589"));
	}
	
	@GetMapping("/books")
	public List<Book> getallbooks(){
		return books;
	}
	
	@GetMapping("/books/{id}")
	public Book getbookbyid(@PathVariable("id") int idd) {
		Book n=null;
		for(Book b:books) {
			if(b.getBoook_Id()==idd) {
				n=b;
			}
		}
		if(n!=null) {
			return n;
		}else {
			throw new IllegalArgumentException("Book not found with that id");
		}
		
	}
	
	
	@PostMapping("/books")
	public Book addnewbook(@RequestBody Book book) {
		books.add(book);
		return book;
		
	}
	
	@DeleteMapping("/books/{id}")
	public String deletebook(@PathVariable("id") int id) {
		String msg="book not found";
		for(int i=0;i<books.size();i++) {
			Book b=books.get(i);
			if(b.getBoook_Id()==id) {
				books.remove(b);
				msg="Book deleted successfully";
			}
		}
		return msg;
		
	}
	
	@PutMapping("/books/{id}")
	public String updatebook(@PathVariable("id") int id,@RequestBody Book book) {
		String msg="Book not found with that id";
		for(int i=0;i<books.size();i++) {
			Book b=books.get(i);
			if(b.getBoook_Id()==id) {
				books.remove(b);
				b=book;
				books.add(b);
				msg="Book updated succesfully";
			}
		}
		
		return msg;
		
	}
	
	@PutMapping("/updateprice/{id}")
	public String updateprice(@PathVariable("id") int id,@RequestParam("price") int pr) {
		String msg="Book not found with that id";
		for(int i=0;i<books.size();i++) {
			Book b=books.get(i);
			if(b.getBoook_Id()==id) {
				b.setPrice(pr);
				msg="Book's price updated succesfully";
			}
		}
		
		return msg;
	}
	
}

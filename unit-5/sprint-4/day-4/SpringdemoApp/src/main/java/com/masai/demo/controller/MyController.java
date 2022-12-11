package com.masai.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.demo.model.Book;
import com.masai.demo.model.BookNotFoundException;

import jakarta.annotation.PostConstruct;

@RestController
public class MyController {

	private List<Book> books=new ArrayList<>();
	
	
	@PostConstruct
	public void setbooks() {
		books.add(new Book(101, "C++", "Rahul", 1800));
		books.add(new Book(201, "C##", "Rohit", 1500));
		books.add(new Book(301, "C", "Ritu", 1710));
		books.add(new Book(401, "C#", "Romi", 1980));
		books.add(new Book(501, "Java", "Ruby", 1760));
	}
	
	@GetMapping("/books")
	public List<Book> getallbooks() throws BookNotFoundException{
		if(books.size()==0) {
			throw new BookNotFoundException("No Books Found");
		}
		return books;
	}
	
	@GetMapping("/books/{id}")
	public Book getbookbyid(@PathVariable("id") int idd) throws BookNotFoundException {
		Book n=null;
		for(Book b:books) {
			if(b.getBook_Id()==idd) {
				n=b;
			}
		}
		if(n!=null) {
			return n;
		}else {
			throw new BookNotFoundException("Book not found with that id");
		}
		
	}
	
	@PostMapping("/books")
	public Book addnewbook(@RequestBody Book book) {
		books.add(book);
		return book;
		
	}
	
	@DeleteMapping("/books/{id}")
	public String deletebook(@PathVariable("id") int id) throws BookNotFoundException {
		String msg="";
		for(int i=0;i<books.size();i++) {
			Book b=books.get(i);
			if(b.getBook_Id()==id) {
				books.remove(b);
				msg="Book deleted successfully";
				return msg;
			}
		}
		
		throw new BookNotFoundException("Book not found with that id");
	}
	
	@PutMapping("/books/{id}")
	public String updatebook(@PathVariable("id") int id,@RequestBody Book book) throws BookNotFoundException {
		String msg="";
		for(int i=0;i<books.size();i++) {
			Book b=books.get(i);
			if(b.getBook_Id()==id) {
				books.remove(b);
				b=book;
				books.add(b);
				msg="Book updated succesfully";
				return msg;
			}
		}
		throw new BookNotFoundException("Book not found with that id");
		
		
	}
}

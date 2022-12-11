package com.masai.demo.Model;

import org.springframework.stereotype.Controller;

@Controller
public class MyService{
	public void sayHello(String name){
		System.out.println("Welcome "+name);
	}
}


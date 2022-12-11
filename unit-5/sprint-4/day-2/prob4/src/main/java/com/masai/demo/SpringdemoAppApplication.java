package com.masai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.masai.demo.Model.MyService;

@SpringBootApplication
public class SpringdemoAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringdemoAppApplication.class, args);
		
		MyService mine=ctx.getBean("myService",MyService.class);
		
		mine.sayHello("Ashish");
	}

}

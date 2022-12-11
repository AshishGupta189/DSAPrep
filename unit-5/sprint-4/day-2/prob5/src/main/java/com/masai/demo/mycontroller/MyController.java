package com.masai.demo.mycontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masai.demo.model.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/employee")
	@ResponseBody
	public Employee getEmployee() {
		Employee emp=new Employee(1,"Ashu","Ayodhya",150000);
		return emp;
		
		
	}
	
	@RequestMapping("/employees")
	@ResponseBody
	public List<Employee> getEmployees() {
		
		List<Employee> list=new ArrayList<>();
		Employee emp=new Employee(1,"Ashu","Ayodhya",150000);
		Employee emp2=new Employee(2,"Rohit","blr",150000);
		Employee emp3=new Employee(3,"Rahul","mp",150000);
		Employee emp4=new Employee(4,"Bebo","Ayodhya",150000);
		Employee emp5=new Employee(5,"Kishan","uk",150000);
		
		
		list.add(emp);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		return list;
		
		
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Welcome to Spring Boot";
	}
	
}

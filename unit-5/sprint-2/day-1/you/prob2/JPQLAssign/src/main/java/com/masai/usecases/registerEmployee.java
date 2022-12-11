package com.masai.usecases;

import com.masai.DAO.EmployeeDao;
import com.masai.DAO.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

import java.util.Scanner;

public class registerEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter employee name to register");
        String name=sc.next();
        System.out.println("Enter emp address");
        String add=sc.next();
        System.out.println("enter salary");
        int sal=sc.nextInt();

        Employee emp=new Employee(name,add,sal);

        EmployeeDao e=new EmployeeDaoImpl();
        try {
            Employee newemp=e.registerEmployee(emp);
            System.out.println(newemp);
        } catch (EmployeeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

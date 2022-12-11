package com.masai.usecases;

import com.masai.DAO.EmployeeDao;
import com.masai.DAO.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

import java.util.Scanner;

public class deletebyid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter empid to delete employee");
        int id=sc.nextInt();

        EmployeeDao ee=new EmployeeDaoImpl();
        try {
            Employee emp=ee.deleteEmployeeById(id);
            System.out.println(emp);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}

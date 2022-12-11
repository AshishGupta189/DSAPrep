package com.masai;

import java.util.List;
import java.util.Scanner;

public class searchbyadd_usecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter address to get list of employee");
        String s=sc.next();
        EmployeeDao emp=new DaoImpl();

        try {
            List<Employee> e=emp.getEmployeesByAddress(s);
            for(Employee em:e){
                System.out.println(em);
            }
        } catch (EmployeeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

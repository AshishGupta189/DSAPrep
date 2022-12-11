package com.masai;

import java.util.List;

public class getallEmp_usecase {
    public static void main(String[] args) {
        EmployeeDao emp=new DaoImpl();

        try {
            List<Employee> e=emp.getAllEmployees();
            for(Employee em:e){
                System.out.println(em);
            }
        } catch (EmployeeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Employee");
        EntityManager em=emf.createEntityManager();
        for(int i=0;i<4;i++){
            System.out.println("Enter emp"+ (i+1)+" name");
            String name=sc.next();
            System.out.println("Enter emp"+ (i+1)+" salary");
            int sal=sc.nextInt();
            System.out.println("Enter emp"+ (i+1)+" gender");
            String ss=sc.next();
            System.out.println("Enter emp"+ (i+1)+" home address's state");
            String hs=sc.next();
            System.out.println("Enter emp"+ (i+1)+" home address's city");
            String hc=sc.next();
            System.out.println("Enter emp"+ (i+1)+" home address's pincode");
            String hp=sc.next();
            System.out.println("Enter emp"+ (i+1)+" office address's state");
            String os=sc.next();
            System.out.println("Enter emp"+ (i+1)+" home address's city");
            String oc=sc.next();
            System.out.println("Enter emp"+ (i+1)+" home address's pin");
            String op=sc.next();

            Employee emp=new Employee();
            emp.setName(name);
            emp.setSalary(sal);
            emp.setGender(ss);
            emp.getEmpAddress().add(new Address(hs,hc,hp,"Home"));
            emp.getEmpAddress().add(new Address(os,oc,op,"Office"));
            em.getTransaction().begin();
            em.persist(emp);
            em.getTransaction().commit();
        }
        System.out.println("Done....");
        em.close();
    }
}

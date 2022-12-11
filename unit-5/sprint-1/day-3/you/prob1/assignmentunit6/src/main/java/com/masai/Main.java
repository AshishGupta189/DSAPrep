package com.masai;

import com.masai.utility.emutil;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManager em= emutil.provideEntityManager();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id to search");
        int a=sc.nextInt();
        product p=em.find(product.class,a);
        System.out.println(p);
        em.close();
        sc.close();

    }
}

package com.masai.prob2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Scanner;

public class getaddressbycid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id to get address");
        int x=sc.nextInt();

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("college");
        EntityManager em=emf.createEntityManager();
        customer c=em.find(customer.class,x);
        if(c==null){
            System.out.println("wrong id");
        }else{
            List<address> add=c.getAddresses();

            for (address a:add) {
                System.out.println(a.getType()+" "+a.getCity());
            }
        }
    }
}

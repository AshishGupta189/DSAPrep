package com.masai.prob1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class getclgbyroll {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter roll to get clg");
        int x=sc.nextInt();

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("college");
        EntityManager em=emf.createEntityManager();
        student c=em.find(student.class,x);
        if(c==null){
            System.out.println("wrong roll");

        }else{
            System.out.println(c.getcourseId().getCollegeName());
        }
    }
}

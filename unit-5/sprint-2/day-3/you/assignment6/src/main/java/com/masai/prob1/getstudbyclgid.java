package com.masai.prob1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class getstudbyclgid {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter clg id to get students");
        int x=sc.nextInt();

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("college");
        EntityManager em=emf.createEntityManager();
        college c=em.find(college.class,x);
        if(c==null){
            System.out.println("wrong id");

        }else{
            for(student s:c.getS()){
                System.out.println(s.getStudentName());
            }
        }
    }
}

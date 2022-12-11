package com.masai.prob1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        college c1=new college();


        student s1=new student("Rahul","rahul@123","568965896",c1);
        student s2=new student("Amit","amit@123","366653200",c1);
        student s3=new student("Ashu","ashu@123","1230556586",c1);
        student s4=new student("Rohit","rohit@123","4563256633225",c1);
        Set<student> l1=new HashSet<student>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);

        c1.setCollageAddress("Blr");
        c1.setCollegeName("JDBC");
        c1.setS(l1);

        college c2=new college();
        student s5=new student("ashi","rahul@123","568965896",c2);
        student s6=new student("sush","amit@123","366653200",c2);
        student s7=new student("rd","ashu@123","1230556586",c2);
        student s8=new student("sde","rohit@123","4563256633225",c2);
        Set<student> l2=new HashSet<student>();
        l2.add(s5);
        l2.add(s6);
        l2.add(s7);
        l2.add(s8);

        c2.setCollageAddress("orrisha");
        c2.setCollegeName("Atc");
        c2.setS(l2);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("college");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();
        em.close();
        System.out.println("Done...");


    }
}

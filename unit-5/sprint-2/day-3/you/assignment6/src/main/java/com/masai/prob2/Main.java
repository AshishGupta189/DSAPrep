package com.masai.prob2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        customer c=new customer();
        c.setEmail("c1@123");
        c.setName("c1");
        c.setMobileNumber("985895658");
        address a=new address("blr","Chennai","224124",Type.HOME);

        address b=new address("up","lko","224141",Type.OFFICE);

        List<address> l=new ArrayList<>();
        l.add(a);
        l.add(b);
        c.setAddresses(l);

        customer c2=new customer();
        c2.setEmail("c2@123");
        c2.setName("c2");
        c2.setMobileNumber("985895658");
        address e=new address("punjab","amritsar","589333",Type.HOME);
        address d=new address("Assam","Mirpur","798535",Type.OFFICE);
        List<address> l2=new ArrayList<>();
        l2.add(e);
        l2.add(d);
        c2.setAddresses(l2);

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("college");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(c);
        em.persist(c2);
        em.getTransaction().commit();

        System.out.println("Done..");
    }
}

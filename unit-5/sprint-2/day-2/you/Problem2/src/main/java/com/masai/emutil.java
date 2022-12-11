package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class emutil {
    private static EntityManagerFactory emf;
    static{
        emf= Persistence.createEntityManagerFactory("Employee");
    }

    public static EntityManagerFactory provideConnection(){
        return emf;
    }
}

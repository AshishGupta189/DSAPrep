package com.masai.Utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMutil {

    private static EntityManagerFactory emf;

    static{
        emf= Persistence.createEntityManagerFactory("college");

    }

    public static EntityManagerFactory provideConnection(){
        return emf;
    }
}

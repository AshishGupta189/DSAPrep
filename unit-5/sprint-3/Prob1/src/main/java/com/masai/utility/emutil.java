package com.masai.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class emutil {
    private static EntityManagerFactory emf;

    static {
        emf= Persistence.createEntityManagerFactory("person");
    }

    public static EntityManagerFactory provide(){
        return emf;
    }
}

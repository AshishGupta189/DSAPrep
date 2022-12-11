package com.masai.Usecases;

import com.masai.Dao.DaoImpl;
import com.masai.Dao.FitnessDao;
import com.masai.Exception.GymException;
import com.masai.model.Person;

import java.util.Scanner;

public class registerperson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person person=new Person();
        person.setEmail("p1@123000");
        person.setName("PErson1");
        person.setMobile("25652230");

        System.out.println("Enter gym id0");
        int x=sc.nextInt();

        FitnessDao f=new DaoImpl();
        try {
            f.registerPerson(person,x);
        } catch (GymException e) {
            System.out.println(e.getMessage());
        }
    }
}

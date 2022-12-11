package com.masai.Usecases;

import com.masai.Dao.DaoImpl;
import com.masai.Dao.FitnessDao;
import com.masai.Exception.GymException;
import com.masai.model.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class getpersonbygymname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gymname");
        String gym=sc.next();
        FitnessDao f=new DaoImpl();

        try {
            List<Person> p=f.getAllthePersonByGymName(gym);
            for(Person pe:p){
                System.out.println(pe);
            }
        } catch (GymException e) {
            System.out.println(e.getMessage());
        }
    }
}

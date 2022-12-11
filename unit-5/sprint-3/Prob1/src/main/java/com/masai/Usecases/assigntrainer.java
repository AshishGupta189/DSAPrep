package com.masai.Usecases;

import com.masai.Dao.DaoImpl;
import com.masai.Dao.FitnessDao;
import com.masai.Exception.GymException;
import com.masai.Exception.TrainerException;

import java.util.Scanner;

public class assigntrainer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gymid");
        int x=sc.nextInt();
        System.out.println("Enter trainerid");
        int y=sc.nextInt();

        FitnessDao f=new DaoImpl();
        try {
            f.assignTrainerWithGym(y,x);
        } catch (TrainerException e) {
            System.out.println(e.getMessage());
        } catch (GymException e) {
            System.out.println(e.getMessage());
        }
    }
}

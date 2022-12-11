package com.masai.usecases;

import com.masai.Dao.DAO;
import com.masai.Dao.DaoImpl;
import com.masai.Exception.MyException;
import com.masai.model.User;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class retrievebyId {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int c=sc.nextInt();

        DAO d=new DaoImpl();
        try {
            User u=d.retrieveuserbyId(c);
            System.out.println(u.getName());
            System.out.println(u.getPhoneNo());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

}

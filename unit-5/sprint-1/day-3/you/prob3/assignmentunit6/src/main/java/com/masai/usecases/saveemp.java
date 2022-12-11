package com.masai.usecases;

import com.masai.Dao.Empdao;
import com.masai.Dao.empdaoimpl;
import com.masai.model.employee;

import java.util.Scanner;

public class saveemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String s=sc.next();
        System.out.println("Enter address");
        String b=sc.next();
        System.out.println("Enter salary");
        int ss=sc.nextInt();
        employee es=new employee(s,b,ss);
        Empdao e=new empdaoimpl();
        e.save(es);
    }
}

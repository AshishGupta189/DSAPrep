package com.masai.usecases;

import com.masai.Dao.Empdao;
import com.masai.Dao.empdaoimpl;

import java.util.Scanner;

public class givebonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int s=sc.nextInt();
        System.out.println("Enter bonus");
        int ss=sc.nextInt();
        Empdao e=new empdaoimpl();
        String msg=e.giveBonusToEmployee(s,ss);
        System.out.println(msg);
    }
}

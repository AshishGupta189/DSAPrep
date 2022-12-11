package com.masai.usecases;

import com.masai.Dao.Empdao;
import com.masai.Dao.empdaoimpl;

import java.util.Scanner;

public class deleteemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int s=sc.nextInt();
        Empdao e=new empdaoimpl();
        boolean msg=e.deleteEmployee(s);
        System.out.println(msg);
    }
}

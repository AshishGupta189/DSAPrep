package com.masai.usecases;

import com.masai.dao.AccountDaoImpl;
import com.masai.dao.stateBankDAO;

import java.util.Scanner;

public class deletebyid {
    public static void main(String[] args) {
        stateBankDAO dao=new AccountDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        int a=sc.nextInt();
        String msg=dao.deleteAccountById(a);
        System.out.println(msg);
    }
}


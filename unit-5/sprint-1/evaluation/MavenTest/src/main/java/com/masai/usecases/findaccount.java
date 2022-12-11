package com.masai.usecases;

import com.masai.dao.AccountDaoImpl;
import com.masai.dao.stateBankDAO;
import com.masai.model.account;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class findaccount {


    public static void main(String[] args) {
        stateBankDAO dao=new AccountDaoImpl();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account id to find");
        int a=sc.nextInt();
        account b=dao.findAccountById(a);
        System.out.println(b);
    }
}

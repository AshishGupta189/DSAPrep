package com.masai.usecases;

import com.masai.dao.AccountDaoImpl;
import com.masai.dao.stateBankDAO;
import com.masai.model.account;

import java.util.Scanner;

public class saveacc {
    public static void main(String[] args) {
        account a=new account(1,"asdfg","asdfgh",11200.30,"2022-01-10");
        stateBankDAO dao=new AccountDaoImpl();
        String msg=dao.saveAccount(a);
        System.out.println(msg);
    }
}

package com.masai.dao;

import com.masai.model.account;

public interface stateBankDAO {
    account findAccountById(int id);
    String saveAccount(account accountt);
    String deleteAccountById(int id);
    String withdrawFromAccount(double amount,int accountId);
    String depositInAccount(double amount,int accountId);
}
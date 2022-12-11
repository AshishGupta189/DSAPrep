package com.masai.dao;

import com.masai.model.account;
import com.masai.utility.emutil;

import javax.persistence.EntityManager;

public class AccountDaoImpl implements stateBankDAO{
    @Override
    public account findAccountById(int id) {
        account a = null;
        EntityManager em= emutil.provideEntityManager();
        a=em.find(account.class,id);
        em.close();
        return a;
    }

    @Override
    public String saveAccount(account accountt) {
        String msg="";
        EntityManager em= emutil.provideEntityManager();
        em.getTransaction().begin();
        em.merge(accountt);
        em.getTransaction().commit();
        msg="account saved";
        return msg;
    }

    @Override
    public String deleteAccountById(int id) {

        String msg="Account not found";

        EntityManager em= emutil.provideEntityManager();
        account a=em.find(account.class,id);

        if(a!=null){
            em.getTransaction().begin();
            em.remove(a);
            msg="account deleted successfully";
            em.getTransaction().commit();
        }
        em.close();
        return msg;

    }

    @Override
    public String withdrawFromAccount(double amount, int accountId) {
        String msg="account not found";
        EntityManager em= emutil.provideEntityManager();
        account a=em.find(account.class,accountId);
        if(a==null){
            System.out.println("Account doesn't exist");
        }else{
            if(amount<=a.getBalance()){
                a.setBalance(a.getBalance()-amount);
                em.getTransaction().begin();
                em.merge(a);
                em.getTransaction().commit();
                em.close();
                msg="withdrawn succesfully";
            }else{
                msg="Insufficient amount";
            }
        }
        return msg;
    }

    @Override
    public String depositInAccount(double amount, int id) {
        String msg="account not found";
        EntityManager em= emutil.provideEntityManager();
        account a=em.find(account.class,id);
        if(a==null){
            System.out.println("Account doesn't exist");
        }else{
                a.setBalance(a.getBalance()+amount);
                em.getTransaction().begin();
                em.merge(a);
                em.getTransaction().commit();
                em.close();
                msg="deposited succesfully";

        }
        return msg;
    }
}

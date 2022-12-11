package com.masai.usecases;

import com.masai.Dao.DAO;
import com.masai.Dao.DaoImpl;
import com.masai.model.User;
import com.masai.model.email;

public class createuser
{
    public static void main(String[] args) {
        User u=new User();
        u.setName("ashish");
        u.setDateOfBirth("06-07-2002");
        u.setPhoneNo("9845565565");
        email em=new email("askd442@gmail.com","ashish189@mail","16-10-2016",u);
        u.setE(em);
        DAO dao=new DaoImpl();
        String msg=dao.createUser(u);
        System.out.println(msg);
    }
}

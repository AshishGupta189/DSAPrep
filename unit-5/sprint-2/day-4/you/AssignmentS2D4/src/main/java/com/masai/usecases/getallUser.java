package com.masai.usecases;

import com.masai.Dao.DAO;
import com.masai.Dao.DaoImpl;
import com.masai.Exception.MyException;
import com.masai.model.User;

import java.util.List;

public class getallUser {

    public static void main(String[] args) {
        DAO dao=new DaoImpl();
        List<User> list;

        {
            try {
                list = dao.getallUser();
                for (User u : list) {
                    System.out.println(u.getName());
                    System.out.println(u.getPhoneNo());
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package com.masai.Dao;

import com.masai.Exception.MyException;
import com.masai.model.User;
import com.masai.model.email;

import java.util.List;

public interface DAO {

    public List<User> getallUser() throws MyException;
    public String createUser(User user);

    public User retrieveuserbyId(int id) throws MyException;
    public String deleteUser(int id) throws MyException;
    public email getemaildetails(int id) throws MyException;

}

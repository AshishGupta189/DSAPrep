package com.masai.Dao;

import com.masai.Exception.MyException;
import com.masai.Utility.EMutil;
import com.masai.model.User;
import com.masai.model.email;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements DAO{
    @Override
    public List<User> getallUser() throws MyException {
        List<User> users=new ArrayList<>();
        EntityManagerFactory emf= EMutil.provideConnection();
        EntityManager em=emf.createEntityManager();

        Query q=em.createQuery("select u from User u");

        users=q.getResultList();
        em.close();
        if(users.size()==0){
            throw new MyException("No Users found");
        }
        return users;
    }

    @Override
    public String createUser(User user) {
        String msg="Error";
        EntityManagerFactory emf= EMutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        msg="added user";
        return msg;
    }

    @Override
    public User retrieveuserbyId(int id) throws MyException {
        User user=null;
        EntityManagerFactory emf= EMutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        user=em.find(User.class,id);
        if(user==null){
            throw new MyException("User not found by that id");
        }
        return user;
    }

    @Override
    public String deleteUser(int id) throws MyException {
        String msg="No users with that id";
        EntityManagerFactory emf= EMutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        User user=em.find(User.class,id);
        if(user==null){
            em.close();
            throw new MyException("User not found by this id");
        }else{
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
            em.close();
            msg="Deleted...";
        }
        return msg;
    }

    @Override
    public email getemaildetails(int id) throws MyException {
        email e=null;
        EntityManagerFactory emf= EMutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        User user=em.find(User.class,id);
        if(user==null){
            em.close();
            throw new MyException("User not found by this id");
        }else{
            e=user.getE();
        }
        return e;
    }

}

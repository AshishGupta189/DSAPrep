package com.masai.Dao;

import com.masai.model.employee;
import com.masai.utility.emutil;

import javax.persistence.EntityManager;

public class empdaoimpl implements Empdao{
    @Override
    public void save(employee emp) {
        EntityManager em= emutil.provideEntityManager();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public String getAddressOfEmployee(int empId) {
        String a="Employee not found";
        EntityManager em=emutil.provideEntityManager();
        employee e=em.find(employee.class,empId);
        em.close();
        if(e!=null){
            return e.getAddress();
        }
        return a;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        String a="Employee not found";
        EntityManager em=emutil.provideEntityManager();
        employee e=em.find(employee.class,empId);
        if(e!=null) {
            em.getTransaction().begin();
            e.setSalary(e.getSalary() + bonus);
            em.getTransaction().commit();
            em.close();
            a="bonus added to salary";
        }
        return a;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        Boolean a=false;
        EntityManager em=emutil.provideEntityManager();
        employee e=em.find(employee.class,empId);
        if(e!=null){
            em.getTransaction().begin();
            em.remove(e);
            em.getTransaction().commit();
            System.out.println("Deleted successfully");
            a=true;
        }
        em.close();
        return a;
    }
}

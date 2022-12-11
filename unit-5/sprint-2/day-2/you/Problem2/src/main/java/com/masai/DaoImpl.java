package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

public class DaoImpl implements EmployeeDao{
    @Override
    public List<Employee> getAllEmployees() throws EmployeeException {
        List<Employee> emp;
        EntityManagerFactory emf=emutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        Query query=em.createQuery("select e from Employee e");
        emp=query.getResultList();
        em.close();
        if(emp.size()==0){
            throw new EmployeeException("No users found");
        }
        return emp;
    }

    @Override
    public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
        List<Employee> emp;
        EntityManagerFactory emf=emutil.provideConnection();
        EntityManager em=emf.createEntityManager();
        Query query=em.createNamedQuery("find by add");
        query.setParameter("add",address);
        emp=query.getResultList();
        em.close();
        if(emp.size()==0){
            throw new EmployeeException("No users found");
        }

        return emp;
    }
}

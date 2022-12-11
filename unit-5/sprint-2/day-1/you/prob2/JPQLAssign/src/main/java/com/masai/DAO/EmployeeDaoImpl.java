package com.masai.DAO;

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.emutil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee registerEmployee(Employee employee) throws EmployeeException {
        Employee emp=null;
        EntityManager em= emutil.provideEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        emp=new Employee(employee.getEmpid(),employee.getName(),employee.getAddress(),employee.getSalary());
        return emp;
    }

    @Override
    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee emp=null;
        EntityManager em= emutil.provideEntityManager();
        Query query=em.createNamedQuery("getbyid");
        query.setParameter("id",empId);
        List<Employee> e=query.getResultList();
        if(e.size()==0){
            throw new EmployeeException("User not found");
        }
        em.close();
        return e.get(0);
    }

    @Override
    public Employee deleteEmployeeById(int empId) throws EmployeeException {
        Employee emp=null;
        EntityManager em= emutil.provideEntityManager();
        Query query=em.createNamedQuery("getbyid");
        query.setParameter("id",empId);
        List<Employee> e=query.getResultList();
        if(e.size()==0){
            throw new EmployeeException("User not found");
        }
        em.getTransaction().begin();
        em.remove(e.get(0));
        em.getTransaction().commit();
        em.close();
        return e.get(0);
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        Employee emp=null;
        EntityManager em= emutil.provideEntityManager();
        emp=em.find(Employee.class,employee.getEmpid());
        if(emp!=null){
            emp.setName(employee.getName());
            emp.setAddress(employee.getAddress());
            emp.setSalary(employee.getSalary());
            em.getTransaction().begin();
            em.merge(emp);
            em.getTransaction().commit();
            em.close();
            return emp;
        }
        else{
            throw new EmployeeException("User not found");
        }

    }
}

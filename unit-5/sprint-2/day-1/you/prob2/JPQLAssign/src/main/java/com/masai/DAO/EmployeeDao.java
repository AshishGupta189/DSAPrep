package com.masai.DAO;

import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public interface EmployeeDao{
    public Employee registerEmployee(Employee employee)throws EmployeeException;
    // the above method take an Employee object without an empId and returned the
    //registered Employee object having the autogenerated Id
    public Employee getEmployeeById(int empId)throws EmployeeException;
    public Employee deleteEmployeeById(int empId) throws EmployeeException;
    public Employee updateEmployee(Employee employee)throws EmployeeException;
//the above method will return the updated Employee object, if we supply any Employee
    //object, which is not existing then it should throw the EmployeeException
}
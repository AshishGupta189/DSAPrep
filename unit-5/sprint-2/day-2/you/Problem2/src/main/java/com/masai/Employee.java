package com.masai;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@NamedQuery(name="find by add",query = "select e from Employee e where e.address=:add")
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String name;
    private String address;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public Employee(int empId, String name, String address, int salary) {
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Employee() {
    }
}

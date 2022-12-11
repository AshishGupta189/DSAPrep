package com.masai;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empID;
    private String name;
    private String gender;

    private int salary;
    @Embedded
    @ElementCollection
    @JoinTable(name ="address")

    private Set<Address> empAddress = new HashSet();

    public int getEmpID() {
        return empID;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", empAddress=" + empAddress +
                '}';
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Address> getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(Set<Address> empAddress) {
        this.empAddress = empAddress;
    }

    public Employee(String name, String gender, int salary, Set<Address> empAddress) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.empAddress = empAddress;
    }
}

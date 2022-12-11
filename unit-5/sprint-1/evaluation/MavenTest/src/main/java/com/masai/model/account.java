package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accno;
    private String email;
    private  String address;
    private double balance;
    private String created_date;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCreated_date() {
        return created_date;
    }

    public account() {
    }

    @Override
    public String toString() {
        return "account{" +
                "accno=" + accno +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", created_date='" + created_date + '\'' +
                '}';
    }

    public account(int accno, String email, String address, double balance, String created_date) {
        this.accno = accno;
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.created_date = created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
}

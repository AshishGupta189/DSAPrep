package com.masai.model;

import javax.persistence.*;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String phoneNo;
    private String dateOfBirth;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="user")
    private email e;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public email getE() {
        return e;
    }

    public void setE(email e) {
        this.e = e;
    }

    public User() {
    }

    public User(String name, String phoneNo, String dateOfBirth, email e) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.e = e;
    }
}

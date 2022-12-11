package com.masai.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int person_id;
    private String name;
    private String email;
    private String mobile;
    @ManyToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private Set<Gym> gym;


    public Set<Gym> getGym() {
        return gym;
    }

    public void setGym(Set<Gym> gym) {
        this.gym = gym;
    }

    public Person(String name, String email, String mobile, Set<Gym> gym) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gym = gym;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    public Person() {
    }
}

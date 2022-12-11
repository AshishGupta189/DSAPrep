package com.masai.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gym_id;
    private String gym_name;
    private int monthly_fee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Gym() {
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="persongym",joinColumns = {@JoinColumn(name = "gym_id")},inverseJoinColumns = {@JoinColumn(name = "person_id")})
    private List<Person> person;

    public Gym(String gym_name, int monthly_fee, List<Person> person) {
        this.gym_name = gym_name;
        this.monthly_fee = monthly_fee;
        this.person = person;
    }

    public int getGym_id() {
        return gym_id;
    }

    public void setGym_id(int gym_id) {
        this.gym_id = gym_id;
    }

    public String getGym_name() {
        return gym_name;
    }

    public void setGym_name(String gym_name) {
        this.gym_name = gym_name;
    }

    public int getMonthly_fee() {
        return monthly_fee;
    }

    public void setMonthly_fee(int monthly_fee) {
        this.monthly_fee = monthly_fee;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}

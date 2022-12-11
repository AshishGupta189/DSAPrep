package com.masai.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainer_id;
    private String  trainer_name;
    private int year_of_experience;
    private String email;

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public Trainer() {
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public int getYear_of_experience() {
        return year_of_experience;
    }

    public void setYear_of_experience(int year_of_experience) {
        this.year_of_experience = year_of_experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(Set<Gym> gyms) {
        this.gyms = gyms;
    }

    @OneToMany(mappedBy = "trainer",cascade = CascadeType.ALL)

    private Set<Gym> gyms;

    public Trainer(String trainer_name, int year_of_experience, String email, Set<Gym> gyms) {
        this.trainer_name = trainer_name;
        this.year_of_experience = year_of_experience;
        this.email = email;
        this.gyms = gyms;
    }
}

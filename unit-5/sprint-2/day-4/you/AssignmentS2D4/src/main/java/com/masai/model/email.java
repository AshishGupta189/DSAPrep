package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class email {
    @Id
    private String mail_id;
    private String email;
    private String created_date;
    @OneToOne(mappedBy = "e",cascade = CascadeType.ALL)
    private User user;

    public email(String mail_id, String email, String created_date, User user) {
        this.mail_id = mail_id;
        this.email = email;
        this.created_date = created_date;
        this.user = user;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public email() {
    }
}

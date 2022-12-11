package com.masai.prob2;

import javax.persistence.*;
import java.util.List;

@Entity
public class customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String name;
    private String mobileNumber;
    private String email;

    public customer() {
    }

    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)
    private List<address> addresses;

    public customer(String name, String mobileNumber, String email, List<address> addresses) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.addresses = addresses;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<address> addresses) {
        this.addresses = addresses;
    }
}

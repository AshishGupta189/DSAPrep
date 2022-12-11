package com.masai.prob2;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class address {
    private String state;
    private String city;
    private String pincode;
    @Enumerated(EnumType.STRING)
    private Type type;

    public address() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public address(String state, String city, String pincode, Type type) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.type = type;
    }
}

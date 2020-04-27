package com.belajarSpring.initialzDemo.Entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class Username {
    @Size(min = 3,max = 20, message = "name between 3-20 character")
    private String name;
    @Size(min = 5, max = 30, message = "address between 5-30 character")
    private String address;

    // unutuk memvalidasi email
    @Email(message = "invalid email bro")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}

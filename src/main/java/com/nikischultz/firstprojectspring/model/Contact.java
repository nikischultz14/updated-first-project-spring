package com.nikischultz.firstprojectspring.model;

import javax.persistence.Entity;

@Entity
public class Contact extends Person {

    private String phoneNumber;
    private String emailAddress;
    private String city;
    private String state;

    public Contact() {

    }

    public Contact(String firstName, String lastName, Integer age, String gender, String phoneNumber, String emailAddress, String city, String state) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setGender(gender);
        this.setPhoneNumber(phoneNumber);
        this.setEmailAddress(emailAddress);
        this.setCity(city);
        this.setState(state);
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

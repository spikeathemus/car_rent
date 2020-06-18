package com.fireuprecruitmentproject.rent_car.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Column
    @Id
    @GeneratedValue
    private int userId;

    @Column(name="imię")
    private String firstName;
    @Column(name="nazwisko")
    private String secondName;
    @Column(name="email" , unique = true)
    private String eMail;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
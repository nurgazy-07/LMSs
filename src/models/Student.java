package models;

import models.enums.Role;

import java.util.Arrays;

public class Student {
    private int id;
    private String fistName;
    private String lastName;
    private String email;
    private String password;
    private Role gender;

    public Student() {
    }

    public Student(int id, String fistName, String lastName, String email, String password) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getGender() {
        return gender;
    }

    public void setGender(Role gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return     "Student: " +"\n"+
                "     ID     =  " + id +"\n"+
                "   FistName = " + fistName +"\n"+
                "   LastName = " + lastName + "\n"+
                "   Email    = " + email + '\'' +"\n"+
                "   Password = " + password +"\n"+
                "   Gender   = " + gender
                ;
    }
}

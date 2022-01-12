package com.example.a7rv_as_gridview.model;

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

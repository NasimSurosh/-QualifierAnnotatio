package com.example.Primary.Annotation.Entity;

import org.springframework.stereotype.Component;

@Component
public class Student1 implements Instructor{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int examScore;

    public Student1(){
        this.firstName = "Yama";
        this.lastName = "Shirzad";
        this.address = "Hamburg";
        this.email = "abc@example.com";
        this.examScore = 95;
    }
    @Override
    public String getFirstName() {

        return firstName;
    }

    @Override
    public String getLastName() {
        return  lastName;
    }

    @Override
    public String getAddress() {

        return address;
    }

    @Override
    public String getEmail() {

        return  email;
    }

    @Override
    public int getExamScore() {

        return examScore;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", examScore=" + examScore +
                '}';
    }
}

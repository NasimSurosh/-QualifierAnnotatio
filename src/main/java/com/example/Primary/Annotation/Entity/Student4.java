package com.example.Primary.Annotation.Entity;

import org.springframework.stereotype.Component;

@Component
public class Student4 implements Instructor{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int examScore;

    public Student4(){
        this.firstName = "Samba";
        this.lastName = "Ankor";
        this.address = "Hamburg";
        this.email = "sa@example.com";
        this.examScore = 87;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getExamScore() {

        return examScore;
    }

    @Override
    public String toString() {
        return "Student4{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", examScore=" + examScore +
                '}';
    }
}

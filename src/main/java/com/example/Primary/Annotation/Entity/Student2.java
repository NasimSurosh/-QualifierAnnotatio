package com.example.Primary.Annotation.Entity;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Student2 implements Instructor{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int examScore;

    public Student2(){
        this.firstName = "Jam";
        this.lastName = "Alex";
        this.address = "Berlin";
        this.email = "JA@example.com";
        this.examScore = 78;
    }
    @Override
    public String getFirstName() {
        return "student First name is " + firstName;
    }

    @Override
    public String getLastName() {
        return "student last name is " + lastName;
    }

    @Override
    public String getAddress() {
        return "Student address is " + address;
    }

    @Override
    public String getEmail() {
        return "student email is " + email;
    }

    @Override
    public int getExamScore() {

        return examScore;
    }

}

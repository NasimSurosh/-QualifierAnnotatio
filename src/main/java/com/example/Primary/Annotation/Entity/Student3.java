package com.example.Primary.Annotation.Entity;

// Not using @Component on purpose
public class Student3 implements Instructor{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int examScore;

    public Student3(){
        this.firstName = "Katya";
        this.lastName = "Gorg";
        this.address = "New York";
        this.email = "KG@example.com";
        this.examScore = 82;
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
        return "Student3{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", examScore=" + examScore +
                '}';
    }
}

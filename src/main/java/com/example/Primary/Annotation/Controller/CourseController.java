package com.example.Primary.Annotation.Controller;

import com.example.Primary.Annotation.Entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private Instructor newStudent;
    private Instructor anotherInstructor;

    private Instructor studentInstructor;

    // Define a constructor for dependencies injection
    // @Autowired annotation tells spring to inject a dependencies
    // Here we are doing a constructor injection
    // @Qualifier annotation has priority above @Primary
    @Autowired
    public CourseController(@Qualifier("student1") Instructor student1,
                            @Qualifier("student2") Instructor theNewInstructor,
                            @Qualifier("student") Instructor studentInstructor1){  // both of the constructor values use singleton scope
        newStudent = student1;
        anotherInstructor=theNewInstructor;
        studentInstructor = studentInstructor1;
    }

    @GetMapping("/studentResult")
    public String studentMapping(){

        return newStudent.toString();

    }
    @GetMapping("/studentRe")
    public String student2Mapping(){

        return studentInstructor.toString();

    }



}

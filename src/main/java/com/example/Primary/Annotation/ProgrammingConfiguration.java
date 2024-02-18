package com.example.Primary.Annotation;

import com.example.Primary.Annotation.Entity.Student3;
import com.example.Primary.Annotation.Entity.Instructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProgrammingConfiguration {

    @Bean("student")
    public Instructor student(){

        return new Student3();
    }

}

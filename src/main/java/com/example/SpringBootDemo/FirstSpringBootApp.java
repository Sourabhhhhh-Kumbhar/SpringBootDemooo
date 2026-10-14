package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//Marks this as the starting point; also turn on component scanning
@SpringBootApplication
public class FirstSpringBootApp
{
    public static void main(String[] args)
    {
        //Starts spring and returns the container that holds all beans
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        //Ask the container for the First bean (no "new" needed)
        First obj = context.getBean(First.class);

        //Call the method on the Spring-managed object
        obj.code();
    }
}


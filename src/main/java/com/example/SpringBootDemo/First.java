package com.example.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Tells Spring to create an Alien object and keep it in the container
@Component
public class First
{

    //Spring finds the Computer bean and injects here automatically
    @Autowired
    Computer computer;

    public void code()
    {
        //Uses the injected Laptop (would be null without @Autowired)
        computer.compile();
        System.out.println("Coding////////////////");
    }
}

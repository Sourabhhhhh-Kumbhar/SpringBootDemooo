package com.example.SpringBootDemo;

import org.springframework.stereotype.Component;

//Makes Laptop a bean so Spring can inject it into other classes
@Component
public class Computer
{
    public void compile()
    {
        System.out.println("Computing .../////////");
    }
}

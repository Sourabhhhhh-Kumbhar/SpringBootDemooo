package com.example.SpringBootDemo;
// Imports: bring in the Spring classes we use below
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication turns this class into the starting point of the app.
// It does three things at once:
//   1. Marks this as a configuration class
//   2. Enables auto-configuration (Spring sets things up for you)
//   3. Enables component scanning (Spring searches this package and its
//      sub-packages for classes marked @Component and creates them as beans)


//@SpringBootApplication
//public class AlienDemo
//{
//    // main() is where every Java program starts
//    public static void main(String[] args)
//    {
//        // SpringApplication.run() starts Spring. It creates the "container"
//        // and builds all the beans (objects) inside it.
//        // It returns an ApplicationContext, which is the container itself.
//        // Think of it as a box holding all the objects Spring manages.
//        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
//
//        // Ask the container for the Alien object.
//        // We never write "new Alien()". Spring already created it
//        // because Alien is marked with @Component.
//        Alien obj = context.getBean(Alien.class);
//
//        // Call the method on the object Spring gave us
//        obj.code();
//    }
//
//}

@SpringBootApplication
public class AlienDemo
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        Laptop lap = context.getBean(Laptop.class);
        lap.compile();
    }
}
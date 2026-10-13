// The package must match (or be a parent of) the package of your main class,
// so Spring's component scan can find this class.
package com.example.SpringBootDemo;

// Import the @Component annotation from Spring
import org.springframework.stereotype.Component;

// @Component tells Spring: "Create one object of this class when the app
// starts, and keep it in the container." Spring does the "new Alien()"
// for you. That object is called a bean.
@Component
public class Alien
{
    // A normal Java method. Spring doesn't treat it specially;
    // it just runs when someone calls obj.code().
    public void code()
    {
        System.out.println("Coding...");
    }
}
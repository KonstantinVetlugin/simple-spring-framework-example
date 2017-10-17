package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Restaruant restaruantObj1 = (Restaruant) context.getBean("restaruantBean");
        restaruantObj1.setwelcomeNote("Object1 is setting welcome note property");
        restaruantObj1.greetCustomer();

        Restaruant restaruantObj2 = (Restaruant) context.getBean("restaruantBean");
        restaruantObj2.greetCustomer();


    }
}

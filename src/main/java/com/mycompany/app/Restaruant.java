package com.mycompany.app;

import java.util.List;

public class Restaruant {

    private String welcomeNote;

    public void setwelcomeNote(String welcomeNote){
        this.welcomeNote = welcomeNote;
    }

    public void greetCustomer(){

        System.out.println(welcomeNote);
    }
}

package com.mycompany.app;

public class Tea implements IHotDrink {
    @Override
    public void prepareHotDrink(){
        System.out.println("Dear Custumer, we are preparing Tea for you!");
    }
}

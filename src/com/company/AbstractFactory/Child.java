package com.company.AbstractFactory;

public class Child implements Human {
    @Override
    public void feedPet() {
        System.out.println("Child is feeding pet irresponsibly.");
    }
}

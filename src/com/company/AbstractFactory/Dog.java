package com.company.AbstractFactory;

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating, woof!");
    }
}

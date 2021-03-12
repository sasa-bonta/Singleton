package com.company.Lab1.AbstractFactory;

public class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating, woof!");
    }
}

package com.company.Lab1.AbstractFactory;

public class Rabbit implements Pet {
    @Override
    public void eat() {
        System.out.println("Rabbit is eating, squeak!");
    }
}

package com.company.Lab1.AbstractFactory;

public class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat is eating, meow!");
    }
}

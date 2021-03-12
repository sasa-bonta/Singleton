package com.company.Lab1.FactoryMethod;

public class TestCarFactory {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        Engine engineMk1 = new Engine("Mk.1");
        Body bodyMk1 = new Body("Mk.1");

        Engine engineMk2 = new Engine("Mk.2");
        Body bodyMk2 = new Body("Mk.2");

        Car CarMk1 = CarFactory.getCar(engineMk1, bodyMk1);
        Car CarMk2 = CarFactory.getCar(engineMk2, bodyMk2);
        Car CarMkHybrid = CarFactory.getCar(engineMk1, bodyMk2);
    }
}

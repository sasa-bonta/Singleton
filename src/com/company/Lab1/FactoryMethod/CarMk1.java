package com.company.Lab1.FactoryMethod;

public class CarMk1 implements Car {

    private Engine engine;
    private Body body;

    public CarMk1(Engine engine, Body body) {
        this.engine = engine;
        System.out.println("Powering up the Mk.1 Diesel Engine");

        this.body = body;
        System.out.println("Activating the Mk.1 Pickup Body");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}

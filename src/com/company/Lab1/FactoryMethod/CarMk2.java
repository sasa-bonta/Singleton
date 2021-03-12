package com.company.Lab1.FactoryMethod;

public class CarMk2 implements Car {

    private Engine engine;
    private Body body;

    public CarMk2(Engine engine, Body body) {
        this.engine = engine;
        System.out.println("Powering up the Mk.2 Gas Engine");

        this.body = body;
        System.out.println("Activating the Mk.2 Cabriolet Body");
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setBody(Body body) {
        this.body = body;
    }
}

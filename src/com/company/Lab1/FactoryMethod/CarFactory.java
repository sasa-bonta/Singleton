package com.company.Lab1.FactoryMethod;

public class CarFactory {

        public static Car getCar(Engine engine, Body body) {
        if (engine.getModel().equals("Mk.2") && body.getModel().equals("Mk.2")) {
            return new CarMk2(engine, body);
        } else if (engine.getModel().equals("Mk.1") && body.getModel().equals("Mk.1")) {
            return new CarMk1(engine, body);
        } else {
            System.out.println("Incompatible models of engine and body.");
        }
        return null;
    }
}

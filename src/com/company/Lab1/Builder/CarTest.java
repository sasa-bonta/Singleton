package com.company.Lab1.Builder;


/**
 * The Builder Design Pattern separates the construction of a complex object from its representation.
 * This is done via a nested static class that assigns the required values before the instance is returned.
 *
 * Another thing to note is that the Builder Pattern is often used to create immutable objects.
 * The existence of setter methods pretty much defies immutability,
 * and since we don't use them when we have the Builder Pattern in place,
 * it's a lot easier to make immutable objects - without having to pass all parameters in the constructor call.
 */
public class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car
                .CarBuilder()
                .withBrand("Mercedes")
                .withModel("ML 230")
                .ofYear(1999)
                .withVin("x45v894ERTR97456")
                .withFuel("Petrol")
                .withEngineVolume(2398)
                .withWeight(1830)
                .build();

        Car car2 = new Car
                .CarBuilder()
                .withBrand("Suzuki")
                .withModel("SX4")
                .ofYear(2013)
                .withVin("JN8AS5MT7EW612009")
                .withFuel("Petrol")
                .withEngineVolume(1599)
                .withWeight(1155)
                .build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

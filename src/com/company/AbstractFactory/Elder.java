package com.company.AbstractFactory;

public class Elder implements Human {
    @Override
    public void feedPet() {
        System.out.println("Elder is overfeeding the pet.");
    }
}

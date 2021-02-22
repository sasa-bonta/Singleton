package com.company.AbstractFactory;

public class Adult implements Human {
    @Override
    public void feedPet() {
        System.out.println("Adult is feeding pet responsibly.");
    }
}

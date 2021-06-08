package com.company.SOLID.ISP.Bad;

public class Iphone implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void chat() {
        System.out.println("Messaging...");
    }

    @Override
    public void photo() {
        System.out.println("Taking picture...");
    }
}

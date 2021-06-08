package com.company.SOLID.ISP.Good;

public class Iphone implements Phone, Chat, Camera {
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

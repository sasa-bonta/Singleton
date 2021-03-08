package com.company.Lab2.Adapter;

public class RoundPeg implements Circularity {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public RoundPeg(int radius) {
        this.radius = radius;
    }
}

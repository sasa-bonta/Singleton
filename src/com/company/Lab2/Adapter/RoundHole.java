package com.company.Lab2.Adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean pegFits(Circularity peg) {
        return peg.getRadius() <= radius;
    }

    public double getRadius() {
        return radius;
    }
}

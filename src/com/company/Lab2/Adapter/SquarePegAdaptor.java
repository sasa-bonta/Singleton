package com.company.Lab2.Adapter;

public class SquarePegAdaptor implements Circularity {
    private SquarePeg peg;

    public SquarePegAdaptor(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth()/2), 2) * 2);
    }
}

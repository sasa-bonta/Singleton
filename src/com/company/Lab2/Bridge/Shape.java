package com.company.Lab2.Bridge;

public abstract class Shape {
    protected Color color;

    //Constructor
    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
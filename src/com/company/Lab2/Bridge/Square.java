package com.company.Lab2.Bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }
    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}

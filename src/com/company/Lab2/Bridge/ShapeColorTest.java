package com.company.Lab2.Bridge;

public class ShapeColorTest {

    public static void main(String[] args) {
        //Blue Square
        Shape square = new Square(new Blue());
        System.out.println(square.draw());
        //Red Circle
        Shape circle = new Circle(new Red());
        System.out.println(circle.draw());
        //Red Square
        Shape square2 = new Square(new Red());
        System.out.println(square2.draw());
        //Blue Circle
        Shape circle2 = new Circle(new Blue());
        System.out.println(circle2.draw());
    }
}

package com.company.OCP.BadOCP;

public class Multiplying implements CalculatorOperation{

    private double left;
    private double right;
    private double result;

    //Constructor

    public Multiplying(double left, double right) {
        this.left = left;
        this.right = right;
    }

    //Getters and setters

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

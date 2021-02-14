package com.company.OCP.BadOCP;

import java.security.InvalidParameterException;

public class Calculator {
    CalculatorOperation operation;

    public Calculator() {
    }

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
            System.out.println("Addition of " + addition.getLeft() + " and " + addition.getRight() + " results: " + addition.getResult());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
            System.out.println("Subtraction " + subtraction.getRight() + " from " + subtraction.getLeft() + " results: " + subtraction.getResult());
        } else if (operation instanceof Multiplying) {
            Multiplying multiplying = (Multiplying) operation;
            multiplying.setResult(multiplying.getLeft() * multiplying.getRight());
            System.out.println("Multiplying of " + multiplying.getLeft() + " and " + multiplying.getRight() + " results: " + multiplying.getResult());
        }
    }
}

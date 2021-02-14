package com.company.OCP.GoodOCP;

import java.security.InvalidParameterException;

public class Calculator {
    CalculatorOperation operation;

    public Calculator() {
    }

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        operation.perform();
    }
}

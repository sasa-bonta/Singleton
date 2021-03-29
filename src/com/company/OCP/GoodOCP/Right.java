package com.company.OCP.GoodOCP;

public class Right {

    public static void main(String[] args) {

        Addition a1 = new Addition(0.05, 0.1);
        Subtraction s1 = new Subtraction(27, 73);
        Multiplying m1 = new Multiplying(13, 13);
        Division d1 = new Division(125, 25);

// Division

        Calculator calculator = new Calculator();

        //Test1

        calculator.calculate(a1);

        calculator.calculate(s1);

        calculator.calculate(d1);

//        calculator.calculate(m1);
//
//        //Test2
//
//        calculator.calculate(new Addition(27, 73));
//
//        calculator.calculate(new Subtraction(27, 73));
//
//        calculator.calculate(new Multiplying(13, 13));
      }
}

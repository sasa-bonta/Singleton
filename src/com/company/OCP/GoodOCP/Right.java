package com.company.OCP.GoodOCP;

public class Right {

    public static void main(String[] args) {

        Addition a1 = new Addition(27, 73);
        Subtraction s1 = new Subtraction(27, 73);
//        Multiplying m1 = new Multiplying(13, 13);

// Division

        Calculator calculator = new Calculator();

        //Test1

        calculator.calculate(a1);

        calculator.calculate(s1);

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

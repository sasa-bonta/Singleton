package com.company.Lab2.Adapter;

public class AdapterTest {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(4.0);
        Circularity peg;
        System.out.println("Round hole. Diameter == " + hole.getRadius());
        for (int i = 3; i <= 10; i++) {
            peg = new SquarePegAdaptor(new SquarePeg(i));
            System.out.println("\nSquare peg. Width == " + i + ". Diameter == " + peg.getRadius());
                System.out.println("Peg fits? == " + hole.pegFits(peg));
        }
    }
}

package com.company.SOLID.LSP.Bad;

public class Developer extends Employee {

    @Override
    public void makeTask() {
        System.out.println("The developer makes task");
    }

    @Override
    public void getPayed() {
        System.out.println("THe developer gets salary");
    }
}

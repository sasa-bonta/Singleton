package com.company.SOLID.LSP.Good;

public class Developer extends PermanentEmployee {

    @Override
    public void makeTask() {
        System.out.println("The developer makes task");
    }

    @Override
    public void getPayed() {
        System.out.println("THe developer gets salary");
    }
}

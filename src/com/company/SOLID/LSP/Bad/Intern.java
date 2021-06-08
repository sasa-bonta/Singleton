package com.company.SOLID.LSP.Bad;

import jdk.jshell.spi.ExecutionControl;

public class Intern extends Employee {

    @Override
    public void makeTask() {
        System.out.println("The intern makes task");
    }

    @Override
    public void getPayed() throws Exception {
        throw new ExecutionControl.NotImplementedException("Intern doesn't get salary");
    }
}

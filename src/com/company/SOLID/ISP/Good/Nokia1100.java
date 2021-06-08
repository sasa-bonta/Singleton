package com.company.SOLID.ISP.Good;

import jdk.jshell.spi.ExecutionControl;

public class Nokia1100 implements Phone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }
}

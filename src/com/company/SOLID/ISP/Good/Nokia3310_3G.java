package com.company.SOLID.ISP.Good;

import jdk.jshell.spi.ExecutionControl;

public class Nokia3310_3G implements Phone, Camera {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void photo() {
        System.out.println("Taking picture...");
    }
}

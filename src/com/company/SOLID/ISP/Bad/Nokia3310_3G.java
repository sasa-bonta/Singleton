package com.company.SOLID.ISP.Bad;

import jdk.jshell.spi.ExecutionControl;

public class Nokia3310_3G implements Phone{
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void chat() throws Exception {
        throw new ExecutionControl.NotImplementedException("Not implemented");
    }

    @Override
    public void photo() throws Exception {
        System.out.println("Taking picture...");
    }
}

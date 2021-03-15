package com.company.Lab2.Proxy;

// https://www.baeldung.com/java-proxy-pattern

public class Test {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}

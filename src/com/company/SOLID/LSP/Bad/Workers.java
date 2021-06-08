package com.company.SOLID.LSP.Bad;

public class Workers {

    public static void main(String[] args) throws Exception {
        Developer dev = new Developer();
        Intern intern = new Intern();

        dev.makeTask();
        dev.getPayed();

        intern.makeTask();
        intern.getPayed();
    }
}

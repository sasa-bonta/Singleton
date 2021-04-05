package com.company.Lab3.Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

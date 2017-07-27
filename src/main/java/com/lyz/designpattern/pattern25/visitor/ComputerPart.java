package com.lyz.designpattern.pattern25.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
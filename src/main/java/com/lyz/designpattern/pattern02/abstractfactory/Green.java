package com.lyz.designpattern.pattern02.abstractfactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

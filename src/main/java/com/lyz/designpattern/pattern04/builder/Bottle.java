package com.lyz.designpattern.pattern04.builder;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Use Bottle";
    }
}

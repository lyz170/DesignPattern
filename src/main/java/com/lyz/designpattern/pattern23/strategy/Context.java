package com.lyz.designpattern.pattern23.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public long executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
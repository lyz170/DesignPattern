package com.lyz.designpattern.pattern23.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public long doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

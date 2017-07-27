package com.lyz.designpattern.pattern14.chainofresponsibility;

public enum LoggerType {
    INFO(1), DEBUG(2), ERROR(3);

    private int level;

    private LoggerType(int level) {
        this.level = level;
    }

    public int getCode() {
        return level;
    }
}

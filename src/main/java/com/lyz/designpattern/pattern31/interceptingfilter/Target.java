package com.lyz.designpattern.pattern31.interceptingfilter;

public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}

package com.lyz.designpattern.pattern31.interceptingfilter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}

package com.lyz.designpattern.pattern05.prototype;

public class Square extends Shape {

    public Square() {
        type = ShapeType.SQUARE;
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

package com.lyz.designpattern.pattern05.prototype;

public class Circle extends Shape {

    public Circle() {
        type = ShapeType.CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

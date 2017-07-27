package com.lyz.designpattern.pattern05.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = ShapeType.RECTANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

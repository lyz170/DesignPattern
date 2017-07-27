package com.lyz.designpattern.pattern02.abstractfactory;

public abstract class AbstractFactory {

    abstract Color getColor(ColorType color);

    abstract Shape getShape(ShapeType shape);
}

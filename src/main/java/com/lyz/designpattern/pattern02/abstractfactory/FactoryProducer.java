package com.lyz.designpattern.pattern02.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType choice) {
        if (choice.equals(FactoryType.SHAPE)) {
            return new ShapeFactory();
        } else if (choice.equals(FactoryType.COLOR)) {
            return new ColorFactory();
        }
        return null;
    }
}

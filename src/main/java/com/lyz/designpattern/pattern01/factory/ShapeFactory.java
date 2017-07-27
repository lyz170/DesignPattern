package com.lyz.designpattern.pattern01.factory;

public class ShapeFactory {

    public enum ShapeType {
        CIRCLE, RECTANGLE, SQUARE;
    }

    public Shape getShape(ShapeType shapeType) {

        if (shapeType.equals(ShapeType.CIRCLE)) {
            return new Circle();
        } else if (shapeType.equals(ShapeType.RECTANGLE)) {
            return new Rectangle();
        } else if (shapeType.equals(ShapeType.SQUARE)) {
            return new Square();
        }
        return null;
    }
}

package com.lyz.designpattern.pattern02.abstractfactory;

public class ShapeFactory extends AbstractFactory {

    @Override
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

    @Override
    Color getColor(ColorType color) {
        // TODO Auto-generated method stub
        return null;
    }
}

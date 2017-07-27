package com.lyz.designpattern.pattern02.abstractfactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        return null;
    }

    @Override
    Color getColor(ColorType color) {
        if (color.equals(ColorType.RED)) {
            return new Red();
        } else if (color.equals(ColorType.GREEN)) {
            return new Green();
        } else if (color.equals(ColorType.BLUE)) {
            return new Blue();
        }
        return null;
    }
}

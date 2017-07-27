package com.lyz.designpattern.pattern02.abstractfactory;

public class Demo {

    /**
     * 抽象工厂模式<br>
     * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂,该超级工厂又称为其他工厂的工厂<br>
     * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式<br>
     * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象<br>
     * 
     * 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类<br>
     * 主要解决：主要解决接口选择的问题<br>
     * 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品<br>
     * 如何解决：在一个产品族里面，定义多个产品<br>
     * 关键代码：在一个工厂里聚合多个同类产品<br>
     */
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
        Color color1 = colorFactory.getColor(ColorType.RED);
        color1.fill();
        Color color2 = colorFactory.getColor(ColorType.GREEN);
        color2.fill();
        Color color3 = colorFactory.getColor(ColorType.BLUE);
        color3.fill();
    }

}

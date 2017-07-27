package com.lyz.designpattern.pattern01.factory;

import com.lyz.designpattern.pattern01.factory.ShapeFactory.ShapeType;

public class Demo {

    /**
     * 工厂模式<br>
     * 工厂模式（Factory Pattern）是Java中最常用的设计模式之一<br>
     * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式<br>
     * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象<br>
     * 
     * 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行<br>
     * 主要解决：主要解决接口选择的问题<br>
     * 何时使用：我们明确地计划不同条件下创建不同实例时<br>
     * 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品<br>
     * 关键代码：创建过程在其子类执行<br>
     */
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}

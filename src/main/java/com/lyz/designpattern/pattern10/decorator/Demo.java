package com.lyz.designpattern.pattern10.decorator;

/**
 * 装饰器模式<br>
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。<br>
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装(即装饰器和原类同属一个接口)。<br>
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。<br>
 * 
 * 意图：动态地给一个对象添加一些额外的职责。<br>
 * 就增加功能来说，装饰器模式相比生成子类更为灵活。<br>
 * 主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。<br>
 * 何时使用：在不想增加很多子类的情况下扩展类。 如何解决：将具体功能职责划分，同时继承装饰者模式。<br>
 * 关键代码：<br>
 * 1、Component 类充当抽象角色，不应该具体实现。<br>
 * 2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。<br>
 */
public class Demo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

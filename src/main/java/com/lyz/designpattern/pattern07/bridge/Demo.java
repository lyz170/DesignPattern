package com.lyz.designpattern.pattern07.bridge;

/**
 * 桥接模式<br>
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。<br>
 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构， 来实现二者的解耦。<br>
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。<br>
 *
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。<br>
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。<br>
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。<br>
 * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。<br>
 * 关键代码：抽象类依赖实现类。<br>
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

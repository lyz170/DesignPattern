package com.lyz.designpattern.pattern05.prototype;

/**
 * 原型模式<br>
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。<br>
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。<br>
 * 这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。<br>
 * 当直接创建对象的代价比较大时，则采用这种模式。例如， 一个对象需要在一个高代价的数据库操作之后被创建。<br>
 * 我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。<br>
 * 
 * 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。<br>
 * 主要解决：在运行期建立和删除原型。<br>
 * 何时使用：<br>
 * 1、当一个系统应该独立于它的产品创建，构成和表示时。<br>
 * 2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。<br>
 * 3、为了避免创建一个与产品类层次平行的工厂类层次时。<br>
 * 4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。<br>
 * 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。<br>
 * 关键代码：<br>
 * 1、实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()<br>
 * 2、原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。 <br>
 * 应用实例： <br>
 * 1、细胞分裂。 <br>
 * 2、JAVA 中的 Object clone() 方法。<br>
 */
public class Demo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

    }

}

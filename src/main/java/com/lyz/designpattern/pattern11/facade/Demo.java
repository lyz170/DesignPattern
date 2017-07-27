package com.lyz.designpattern.pattern11.facade;

/**
 * 外观模式<br>
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。<br>
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口， 来隐藏系统的复杂性。<br>
 * 这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。<br>
 *
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。<br>
 * 主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。<br>
 * 何时使用：<br>
 * 1、客户端不需要知道系统内部的复杂联系，整个系统只需提供一个"接待员"即可。<br>
 * 2、定义系统的入口。<br>
 * 如何解决：客户端不与系统耦合，外观类与系统耦合。<br>
 * 关键代码：在客户端和复杂系统之间再加一层，这一次将调用顺序、依赖关系等处理好。<br>
 */
public class Demo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}

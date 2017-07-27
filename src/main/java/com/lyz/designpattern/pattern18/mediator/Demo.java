package com.lyz.designpattern.pattern18.mediator;

/**
 * 中介者模式<br>
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。<br>
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。<br>
 * 中介者模式属于行为型模式。<br>
 * 
 * 意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，<br>
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。<br>
 * 主要解决：对象与对象之间存在大量的关联关系，这样势必会导致系统的结构变得很复杂，<br>
 * 同时若一个对象发生改变，我们也需要跟踪与之相关联的对象， 同时做出相应的处理。<br>
 * 何时使用：多个类相互耦合，形成了网状结构。<br>
 * 如何解决：将上述网状结构分离为星型结构。<br>
 * 关键代码：对象之间的通信封装到一个类中单独处理。<br>
 * 应用实例： 1、中国加入 WTO 之前是各个国家相互贸易，结构复杂，现在是各个国家通过 WTO 来互相贸易。<br>
 * 2、机场调度系统。<br>
 * 3、MVC 框架，其中C（控制器）就是 M（模型）和 V（视图）的中介者。<br>
 */
public class Demo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}

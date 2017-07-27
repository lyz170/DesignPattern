package com.lyz.designpattern.pattern23.strategy;

/**
 * 策略模式<br>
 * 在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。<br>
 * 这种类型的设计模式属于行为型模式。<br>
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的context对象。<br>
 * 策略对象改变context对象的执行算法。<br>
 * 
 * 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。<br>
 * 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。<br>
 * 何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。<br>
 * 如何解决：将这些算法封装成一个一个的类，任意地替换。<br>
 * 关键代码：实现同一个接口。<br>
 * 应用实例：<br>
 * 1、诸葛亮的锦囊妙计，每一个锦囊就是一个策略。<br>
 * 2、旅行的出游方式，选择骑自行车、坐汽车，每一种旅行方式都是一个策略。<br>
 * 3、JAVA AWT 中的 LayoutManager。<br>
 */
public class Demo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}

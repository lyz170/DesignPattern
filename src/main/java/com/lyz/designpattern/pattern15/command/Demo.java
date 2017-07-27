package com.lyz.designpattern.pattern15.command;

/**
 * 命令模式<br>
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。<br>
 * 请求以命令的形式包裹在对象中，并传给调用对象。<br>
 * 调用对象寻找可以处理该命令的合适的对象， 并把该命令传给相应的对象，该对象执行命令。<br>
 * 
 * 意图：将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化。<br>
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，<br>
 * 但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时， 这种无法抵御变化的紧耦合的设计就不太合适。<br>
 * 何时使用：在某些场合，比如要对行为进行"记录、撤销/重做、事务"等处理，这种无法抵御变化的紧耦合是不合适的。<br>
 * 在这种情况下， 如何将"行为请求者"与"行为实现者"解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。<br>
 * 如何解决：通过调用者调用接受者执行命令，<br>
 * 顺序：调用者→接受者→命令。<br>
 * 关键代码：定义三个角色：1、received 真正的命令执行对象 2、Command 3、invoker 使用命令对象的入口<br>
 * 应用实例：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，<br>
 * 而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。<br>
 *
 */
public class Demo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
        System.out.println(broker.getSize());
    }
}

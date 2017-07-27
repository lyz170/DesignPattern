package com.lyz.designpattern.pattern25.visitor;

/**
 * 访问者模式<br>
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。<br>
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。<br>
 * 这种类型的设计模式属于行为型模式。<br>
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。<br>
 * 
 * 意图：主要将数据结构与数据操作分离。<br>
 * 主要解决：稳定的数据结构和易变的操作耦合问题。<br>
 * 何时使用：需要对一个对象结构中的对象进行很多不同的并且不相关的操作，<br>
 * 而需要避免让这些操作"污染"这些对象的类，使用访问者模式将这些封装到类中。<br>
 * 如何解决：在被访问的类里面加一个对外提供接待访问者的接口。<br>
 * 关键代码：在数据基础类里面有一个方法接受访问者，将自身引用传入访问者。<br>
 * 应用实例：您在朋友家做客，您是访问者，朋友接受您的访问，您通过朋友的描述，然后对朋友的描述做出一个判断，这就是访问者模式。<br>
 * 优点： 1、符合单一职责原则。 2、优秀的扩展性。 3、灵活性。<br>
 */
public class Demo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
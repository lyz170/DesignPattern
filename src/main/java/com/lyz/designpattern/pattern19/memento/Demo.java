package com.lyz.designpattern.pattern19.memento;

/**
 * 备忘录模式<br>
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。<br>
 * 备忘录模式属于行为型模式。<br>
 * 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。<br>
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，<br>
 * 并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。<br>
 * 何时使用：很多时候我们总是需要记录一个对象的内部状态，<br>
 * 这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态， 使得他有"后悔药"可吃。<br>
 * 如何解决：通过一个备忘录类专门存储对象状态。<br>
 * 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。<br>
 * 应用实例： 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。 4、IE 中的后退。 4、数据库的事务管理。<br>
 */
public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}

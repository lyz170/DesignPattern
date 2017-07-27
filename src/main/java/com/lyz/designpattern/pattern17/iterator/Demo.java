package com.lyz.designpattern.pattern17.iterator;

/**
 * 迭代器模式<br>
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。<br>
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。 迭代器模式属于行为型模式。<br>
 * 
 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。<br>
 * 主要解决：不同的方式来遍历整个整合对象。<br>
 * 何时使用：遍历一个聚合对象。<br>
 * 如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象。<br>
 * 关键代码：定义接口：hasNext, next。<br>
 * 应用实例：JAVA 中的 iterator。<br>
 */
public class Demo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}

package com.lyz.designpattern.pattern03.singleton;

/**
 * 饿汉式<br>
 * 优点：没有加锁，执行效率会提高。<br>
 * 缺点：类加载时就初始化，浪费内存。<br>
 */
public class SingleObject {

    // 创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    // 让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    // 获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
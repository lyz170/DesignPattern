package com.lyz.designpattern.pattern03.singleton;

/**
 * 懒汉式，线程安全<br>
 * 优点：第一次调用才初始化，避免内存浪费。<br>
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。<br>
 */
public class SingleObject2 {

    private static SingleObject2 instance;

    private SingleObject2() {
    }

    public static synchronized SingleObject2 getInstance() {
        if (instance == null) {
            instance = new SingleObject2();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World2!");
    }
}

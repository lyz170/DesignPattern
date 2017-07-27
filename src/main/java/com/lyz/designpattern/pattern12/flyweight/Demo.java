package com.lyz.designpattern.pattern12.flyweight;

/**
 * 享元模式<br>
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。<br>
 * 这种类型的设计模式属于结构型模式， 它提供了减少对象数量从而改善应用所需的对象结构的方式。<br>
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。<br>
 * 
 * 意图：运用共享技术有效地支持大量细粒度的对象。<br>
 * 主要解决：在有大量对象时，有可能会造成内存溢出，我们把其中共同的部分抽象出来，<br>
 * 如果有相同的业务请求，直接返回在内存中已有的对象，避免重新创建。<br>
 * 何时使用：<br>
 * 1、系统中有大量对象。<br>
 * 2、这些对象消耗大量内存。<br>
 * 3、这些对象的状态大部分可以外部化。<br>
 * 4、这些对象可以按照内蕴状态分为很多组，当把外蕴对象从对象中剔除出来时，每一组对象都可以用一个对象来代替。<br>
 * 5、系统不依赖于这些对象身份，这些对象是不可分辨的。<br>
 * 如何解决：用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。<br>
 * 关键代码：用 HashMap 存储这些对象。<br>
 */
public class Demo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

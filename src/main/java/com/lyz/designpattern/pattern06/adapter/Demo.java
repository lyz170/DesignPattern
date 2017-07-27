package com.lyz.designpattern.pattern06.adapter;

/**
 * 适配器模式<br>
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。<br>
 * 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。<br>
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。<br>
 * 举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。<br>
 * 您将内存卡插入读卡器， 再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。 <br>
 * 我们通过下面的实例来演示适配器模式的使用。<br>
 * 其中，音频播放器设备只能播放 mp3 文件，通过使用一个更高级的音频播放器来播放 vlc 和 mp4 文件。<br>
 * 
 * 意图：将一个类的接口转换成客户希望的另外一个接口。<br>
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。<br>
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的。<br>
 * 何时使用：<br>
 * 1、系统需要使用现有的类，而此类的接口不符合系统的需要。<br>
 * 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，<br>
 * 包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。<br>
 * 3、通过接口转换，将一个类插入另一个类系中。<br>
 * 如何解决：继承或依赖（推荐）。<br>
 * 关键代码：适配器继承或依赖已有的对象，实现想要的目标接口。<br>
 */
public class Demo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(AudioType.MP3, "beyond the horizon.mp3");
        audioPlayer.play(AudioType.MP4, "alone.mp4");
        audioPlayer.play(AudioType.VLC, "far far away.vlc");
        audioPlayer.play(AudioType.AVI, "mind me.avi");
    }
}

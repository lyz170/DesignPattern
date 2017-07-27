package com.lyz.designpattern.pattern06.adapter;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {

        // 播放 mp3 音乐文件的内置支持
        if (AudioType.MP3.equals(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else if (AudioType.VLC.equals(audioType) || AudioType.MP4.equals(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
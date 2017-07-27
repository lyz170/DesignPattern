package com.lyz.designpattern.pattern06.adapter;

/**
 * 创建实现了 MediaPlayer 接口的适配器类
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(AudioType audioType) {
        if (AudioType.VLC.equals(audioType)) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (AudioType.MP4.equals(audioType)) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        if (AudioType.VLC.equals(audioType)) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (AudioType.MP4.equals(audioType)) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

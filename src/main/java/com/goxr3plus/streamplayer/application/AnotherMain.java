package com.goxr3plus.streamplayer.application;

import com.goxr3plus.streamplayer.stream.StreamPlayer;
import com.goxr3plus.streamplayer.stream.StreamPlayerInterface;
import com.goxr3plus.streamplayer.stream.StreamPlayerListener;

public class AnotherMain {
    public static void main(String[] args) {

        final StreamPlayerInterface streamPlayer = new StreamPlayer();
        String audioFileName;
        audioFileName = "Logic - Ballin [Bass Boosted].mp3";
        audioFileName = "Ballin.mp3";
        audioFileName = "Sometimes.flac";
        final AnotherDemoApplication application = new AnotherDemoApplication(streamPlayer, audioFileName);
        application.start();

    }

}

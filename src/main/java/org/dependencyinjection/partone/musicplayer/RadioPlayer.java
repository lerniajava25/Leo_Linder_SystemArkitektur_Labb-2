package org.dependencyinjection.partone.musicplayer;

import org.dependencyinjection.partone.speaker.Speaker;

public class RadioPlayer implements MusicPlayer {

    private final Speaker speaker;

    public RadioPlayer(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String play() {
        return speaker.turnOn() + " Radio is playing.";
    }

    @Override
    public String lowerVolume() {
        return speaker.lowerVolume() + " on radio.";
    }

    @Override
    public String raiseVolume() {
        return speaker.raiseVolume() + " on radio.";
    }
}

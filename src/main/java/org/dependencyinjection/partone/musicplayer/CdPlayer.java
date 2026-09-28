package org.dependencyinjection.partone.musicplayer;

import org.dependencyinjection.partone.speaker.Speaker;

public class CdPlayer implements MusicPlayer {

    private final Speaker speaker;

    public CdPlayer(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public String play() {
        return speaker.turnOn() + " CD is playing.";
    }

    @Override
    public String lowerVolume() {
        return speaker.lowerVolume() + " on CD.";
    }

    @Override
    public String raiseVolume() {
        return speaker.raiseVolume() + " on CD.";
    }
}

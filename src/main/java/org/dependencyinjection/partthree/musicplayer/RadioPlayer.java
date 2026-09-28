package org.dependencyinjection.partthree.musicplayer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.dependencyinjection.partthree.speaker.Speaker;

@ApplicationScoped
public class RadioPlayer implements MusicPlayer {

    private final Speaker speaker;

    @Inject
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

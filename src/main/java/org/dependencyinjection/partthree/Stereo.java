package org.dependencyinjection.partthree;

import jakarta.inject.Inject;
import org.dependencyinjection.partthree.musicplayer.MusicPlayer;

public class Stereo {

    private final MusicPlayer musicPlayer;

    @Inject
    public Stereo(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public String playMusic() {
        return musicPlayer.play();
    }

    public String raiseVolume() {
        return musicPlayer.raiseVolume();
    }

    public String lowerVolume() {
        return musicPlayer.lowerVolume();
    }
}

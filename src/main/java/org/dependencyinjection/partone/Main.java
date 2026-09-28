package org.dependencyinjection.partone;

import org.dependencyinjection.partone.musicplayer.CdPlayer;
import org.dependencyinjection.partone.musicplayer.MusicPlayer;
import org.dependencyinjection.partone.speaker.BasicSpeaker;

public class Main {
    static void main(String[] args) {
        // Manually build the dependency graph using constructor injection.
        BasicSpeaker speaker = new BasicSpeaker();
        MusicPlayer cd = new CdPlayer(speaker);
        Stereo stereo = new Stereo(cd);

        System.out.println(stereo.playMusic());
        System.out.println(stereo.raiseVolume());
    }
}

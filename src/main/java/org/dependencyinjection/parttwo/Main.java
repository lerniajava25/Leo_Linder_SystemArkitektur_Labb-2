package org.dependencyinjection.parttwo;

import org.dependencyinjection.parttwo.musicplayer.MusicPlayer;
import org.dependencyinjection.parttwo.musicplayer.RadioPlayer;
import org.dependencyinjection.parttwo.speaker.BasicSpeaker;
import org.dependencyinjection.parttwo.speaker.Speaker;

public class Main {
    static void main(String[] args) {
        Container container = new Container();

        // Configure the custom DI container and let it resolve the dependency graph.
        container.register(MusicPlayer.class, RadioPlayer.class);
        container.register(Speaker.class, BasicSpeaker.class);

        Stereo stereo = container.getInstance(Stereo.class);

        System.out.println(stereo.playMusic());
    }
}

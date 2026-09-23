package org.dependencyinjection.partone;

public class Main {
    static void main(String[] args){
        BasicSpeaker speaker = new BasicSpeaker();
        MusicPlayer cd = new CdPlayer(speaker);
        Stereo stereo = new Stereo(cd);

        System.out.println(stereo.playMusic());
        System.out.println(stereo.raiseVolume());
    }
}

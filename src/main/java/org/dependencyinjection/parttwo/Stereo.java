package org.dependencyinjection.parttwo;

import org.dependencyinjection.parttwo.musicplayer.MusicPlayer;

public class Stereo {

    private final MusicPlayer musicPlayer;

    public Stereo(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }

    public String playMusic(){
        return musicPlayer.play();
    }

    public String raiseVolume(){
        return musicPlayer.raiseVolume();
    }

    public String lowerVolume(){
        return musicPlayer.lowerVolume();
    }
}

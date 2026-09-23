package org.dependencyinjection.partone;

public class Stereo {

    private final MusicPlayer musicPlayer;

    Stereo(MusicPlayer musicPlayer){
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

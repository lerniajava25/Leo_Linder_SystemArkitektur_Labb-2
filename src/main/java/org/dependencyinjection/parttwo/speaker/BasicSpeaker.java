package org.dependencyinjection.parttwo.speaker;

public class BasicSpeaker implements Speaker {

    @Override
    public String turnOn() {
        return "Basic Speaker turned on!";
    }

    @Override
    public String raiseVolume() {
        return "Volume raised";
    }

    @Override
    public String lowerVolume() {
        return "Volume lowered";
    }
}

package org.dependencyinjection.partthree;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    static void main(String[] args) {
        // Let Weld resolve and create the complete dependency graph.
        Weld weld = new Weld();

        try (WeldContainer container = weld.initialize()) {
            Stereo stereo = container.select(Stereo.class).get();

            System.out.println(stereo.playMusic());
            System.out.println(stereo.raiseVolume());
        }
    }
}

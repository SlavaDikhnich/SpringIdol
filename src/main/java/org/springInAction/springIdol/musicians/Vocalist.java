package org.springInAction.springIdol.musicians;

import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

public class Vocalist implements Performer {

    private String song;

    public Vocalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}

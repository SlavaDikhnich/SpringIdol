package org.springInAction.springIdol.musicians;


import org.springInAction.springIdol.abstractive.Instrument;
import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

public abstract class NewInstrumentalist implements Performer {
    private String song;

    public NewInstrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        getInstrument().play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public abstract Instrument getInstrument();
}

package org.springInAction.springIdol.musicians;

import org.springInAction.springIdol.abstractive.Instrument;
import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public class Instrumentalist implements Performer {
    private String song;

    private Instrument instrument;

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

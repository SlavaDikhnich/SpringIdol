package org.springInAction.springIdol.musicians;

import org.springInAction.springIdol.abstractive.Instrument;
import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.annotations.StringedInstrument;
import org.springInAction.springIdol.exceptions.PerformanceException;
import org.springframework.beans.factory.annotation.Autowired;

public class InstrumentalistAnnotation implements Performer {
    private String song;

    @Autowired
    @StringedInstrument
    private Instrument instrument;

    public InstrumentalistAnnotation() {
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

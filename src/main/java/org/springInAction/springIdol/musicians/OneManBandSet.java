package org.springInAction.springIdol.musicians;


import org.springInAction.springIdol.abstractive.Instrument;
import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

import java.util.Map;

public class OneManBandSet implements Performer {

    private Map<String, Instrument> instruments;

    public OneManBandSet() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}

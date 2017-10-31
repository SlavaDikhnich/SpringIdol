package org.springInAction.springIdol.musicians;

import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

import java.util.Properties;

public class OneManBandProps implements Performer {

    private Properties instruments;

    public OneManBandProps() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (Object name: instruments.keySet()) {
            System.out.println("name: " + name.toString() + " : " + instruments.get(name));
        }
    }

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}

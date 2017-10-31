package org.springInAction.springIdol.instruments;

import org.springInAction.springIdol.abstractive.Instrument;
import org.springInAction.springIdol.annotations.StringedInstrument;

@StringedInstrument
public class Guitar implements Instrument{

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Bla Bla Bla guitar!");
    }
}

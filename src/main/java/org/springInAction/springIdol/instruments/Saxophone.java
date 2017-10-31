package org.springInAction.springIdol.instruments;


import org.springInAction.springIdol.abstractive.Instrument;

public class Saxophone implements Instrument{

    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}

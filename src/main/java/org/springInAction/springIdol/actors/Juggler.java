package org.springInAction.springIdol.actors;

import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}

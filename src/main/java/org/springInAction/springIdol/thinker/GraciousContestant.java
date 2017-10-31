package org.springInAction.springIdol.thinker;

/**
 * Класс реализующий интерфейс Contestant
 */
public class GraciousContestant implements Contestant{
    @Override
    public void receiceAward() {
        System.out.println("I am please to receive this Great award !!!");
    }
}

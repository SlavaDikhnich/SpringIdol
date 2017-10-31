package org.springInAction.springIdol.magicans;

import org.springInAction.springIdol.abstractive.MagicBox;
import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.exceptions.PerformanceException;

public class Magician implements Performer {

    private MagicBox magicBox;
    private String magicWords;

    public Magician(){

    }

    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents());
    }

    public MagicBox getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}

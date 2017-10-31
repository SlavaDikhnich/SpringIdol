package org.springInAction.springIdol.actors;

import org.springInAction.springIdol.abstractive.Poem;

public class Sonnet29 implements Poem {

    private static String[] LINES = {
            "Когда в раздоре с миром и судьбой,",
            "Припомнив годы полные невзгод",
            "Тревожу я бесплодною мольбой",
            "Глухой и равнодушный небосвод",
            "И, жалуясь на горестный удел",
            "Готов меняться жребием своим"
    };

    public Sonnet29() {

    }

    @Override
    public void recite() {
        for (int i=0; i< LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }
}

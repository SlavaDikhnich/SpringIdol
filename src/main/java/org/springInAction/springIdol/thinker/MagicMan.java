package org.springInAction.springIdol.thinker;

/**
 * Класс читателя мыслей
 */
public class MagicMan implements MindReader {

    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts: " + thoughts);
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}

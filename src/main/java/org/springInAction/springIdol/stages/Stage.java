package org.springInAction.springIdol.stages;

public class Stage {

    private Stage() {
    }

    private static class StageSingletonHolder {
        static final Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}

package org.springInAction.springIdol.instruments;

import org.springInAction.springIdol.abstractive.Instrument;
import org.springframework.beans.factory.annotation.Value;

public class Piano implements Instrument {

    @Value("#{serviceProperty[intValue]}") private int var;
    @Value("#{systemEnvironment['JAVA_HOME']}") private String stringVar;
    //@Value("#{systemProperties['application.home']}")


    public Piano() {
    }

    @Override
    public void play() {
        System.out.println("Piano plays Mozart!!!");
        System.out.println("var: " + var + " : sys props: " + stringVar);
    }

    public void setVar(int var) {
        this.var = var;
    }
}

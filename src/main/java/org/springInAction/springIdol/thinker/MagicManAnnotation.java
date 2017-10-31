package org.springInAction.springIdol.thinker;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MagicManAnnotation implements MindReader {
    private String thoughts;

    // Объявление параметризованного среза множества точек сопряжения
    @Pointcut("execution(* org.springInAction.springIdol.thinker.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {
    }

    @Before("thinking(thoughts)")                               // Передача параметра в совет
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts: " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}

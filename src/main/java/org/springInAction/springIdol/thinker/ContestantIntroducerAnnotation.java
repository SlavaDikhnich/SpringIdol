package org.springInAction.springIdol.thinker;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Внедрение интерфейсов с помощью аннотаций
 */
@Aspect
public class ContestantIntroducerAnnotation {

    @DeclareParents(
            value = "org.springInAction.springIdol.abstractive.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}

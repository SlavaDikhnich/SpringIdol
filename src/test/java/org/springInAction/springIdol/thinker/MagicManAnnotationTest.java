package org.springInAction.springIdol.thinker;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Тестирование перехвата с помощью аннотаций
 */
public class MagicManAnnotationTest {

    @Test
    public void magicManTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Thinker volunteer = (Thinker) ctx.getBean("volunteer");
        MindReader magicMan = (MindReader) ctx.getBean("magicManAnnotation");
        volunteer.thinkOfSomething("Queen of Hearts");
        assertEquals("Queen of Hearts", magicMan.getThoughts());

    }
}

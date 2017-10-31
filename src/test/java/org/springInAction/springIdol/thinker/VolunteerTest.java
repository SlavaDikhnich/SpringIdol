package org.springInAction.springIdol.thinker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

public class VolunteerTest {

    @Test
    public void magicianShouldReadVolunteersMindTest() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Thinker volunteer = (Thinker) ctx.getBean("volunteer");
        MindReader magicMan = (MindReader) ctx.getBean("magicMan");

        volunteer.thinkOfSomething("Queen of Hearts");
        assertEquals("Queen of Hearts", magicMan.getThoughts());
    }
}

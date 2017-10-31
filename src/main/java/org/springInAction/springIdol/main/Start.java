package org.springInAction.springIdol.main;

import org.springInAction.springIdol.abstractive.Performer;
import org.springInAction.springIdol.actors.Juggler;
import org.springInAction.springIdol.musicians.Instrumentalist;
import org.springInAction.springIdol.musicians.InstrumentalistAnnotation;
import org.springInAction.springIdol.phones.Contact;
import org.springInAction.springIdol.thinker.Contestant;
import org.springInAction.springIdol.thinker.MindReader;
import org.springInAction.springIdol.thinker.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.Properties;

public class Start {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer kenny = (Performer) ctx.getBean("kenny");
        kenny.perform();

        Properties props = (Properties) ctx.getBean("serviceProperty");
        System.out.println(props.getProperty("intValue"));

        System.out.println();

        Performer magican = (Performer) ctx.getBean("klark");
        magican.perform();

        System.out.println();

//        Instrumentalist pianist = new Instrumentalist();
//        pianist.perform();

        Contact contact = (Contact) ctx.getBean("contactNew");
        System.out.println(contact.getPhoneNumber().getAreaCode());
        System.out.println(contact.getPhoneNumber().getNumber());
        System.out.println(contact.getPhoneNumber().getPrefix());

        System.out.println();
        System.out.println("Localization");

        System.out.println(ctx.getMessage("student", null, new Locale("RU")));
        System.out.println(ctx.getMessage("student", null, null));

        System.out.println();
        System.out.println("Annotation");
        Performer test = (Performer) ctx.getBean("test");
        test.perform();
//        Class<?>[] interfaces = test.getClass().getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getName());
//        }
        Contestant test2 = (Contestant) test;
        test2.receiceAward();

    }
}

package org.springInAction.springIdol.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

public class Fuddifier implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        //System.out.println("postProcessBeforeInitialization " + bean.getClass().toString());
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();

        try {
            for (int i = 0; i < fields.length; i++) {
                if (fields[i].getType().equals(java.lang.String.class)) {
                    fields[i].setAccessible(true);
                    //System.out.println("process " + fields[i]);
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(original));
                }
            }
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }

        return bean;
    }

    private String fuddify(String original) {
        if (original == null) {
            return original;
        }
        return original.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }

}
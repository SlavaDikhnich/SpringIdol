package org.springInAction.springIdol.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanCounter implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
            throws BeansException {
        System.out.println("Bean count: " + factory.getBeanDefinitionCount());
    }
}

package com.epam.spring.homework3.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        if (bean instanceof Bean) {
            if (((Bean) bean).getName() == null || ((Bean) bean).getValue() < 0) {
                System.out.println("Not valid " + bean.getClass().getSimpleName());
            }
        }
        return bean;
    }

}

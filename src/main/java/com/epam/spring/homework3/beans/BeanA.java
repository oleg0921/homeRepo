package com.epam.spring.homework3.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean, DisposableBean {
    private String name;
    private int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public BeanA() {
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " destroy");
    }
}

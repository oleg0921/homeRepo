package com.epam.spring.homework3.beans;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanE implements Bean{
    private String name;
    private int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println(this.getClass().getSimpleName() + "  postConstructor() inside in ");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(this.getClass().getSimpleName() + " - preDestroy()");
    }
    public BeanE() {
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }
}

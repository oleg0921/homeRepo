package com.epam.spring.homework3.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanD implements Bean {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;


    private void customInitMethod(){
        System.out.println("init method " + this.getClass().getSimpleName() );
    }

    private void changedInitMethod(){
        System.out.println("init method changed " + this.getClass().getSimpleName() );
    }

    private void customDestroyMethod(){
        System.out.println("destroy method " + this.getClass().getSimpleName() );
    }

    public BeanD(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public BeanD(){

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

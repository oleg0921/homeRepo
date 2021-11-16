package com.epam.spring.homework3.beans;

public class BeanF implements Bean{

    private String name;
    private int value;


    public BeanF(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public BeanF(){

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

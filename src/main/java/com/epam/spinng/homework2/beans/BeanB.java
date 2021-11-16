package com.epam.spinng.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {

    public BeanB(){
        System.out.println(this.getClass().getSimpleName());
    }
}

package com.epam.spinng.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {

    public BeanC(){
        System.out.println(this.getClass().getSimpleName());
    }
}

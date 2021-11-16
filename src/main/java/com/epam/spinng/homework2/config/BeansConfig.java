package com.epam.spinng.homework2.config;


import com.epam.spinng.homework2.beans.BeanA;
import com.epam.spinng.homework2.beans.BeanB;
import com.epam.spinng.homework2.beans.BeanC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.epam.spinng.homework2.beans")
@Import(OtherConfig.class)
public class BeansConfig {


    public BeanA beanA() {
        return new BeanA();
    }


    public BeanB beanB() {
        return new BeanB();
    }


    public BeanC beanC() {
        return new BeanC();
    }
}

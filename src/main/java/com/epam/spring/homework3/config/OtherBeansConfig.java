package com.epam.spring.homework3.config;
import com.epam.spring.homework3.beans.BeanF;
import org.springframework.context.annotation.*;



public class OtherBeansConfig {

    @Bean
    @Lazy
    public BeanF getBeanF() {
        return new BeanF();
    }
}

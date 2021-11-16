package com.epam.spinng.homework2.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import com.epam.spinng.homework2.pet.Cheetah;
import com.epam.spinng.homework2.pet.Spider;


@Configuration
@ComponentScan(basePackages = {"com.epam.spinng.homework2.pet"}, excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class)})

public class PetConfig {

    @Bean
    @Primary
    public Cheetah getCheetah(){
        return new Cheetah();
    }

    @Qualifier("myCheetah")
    @Bean
    public Cheetah getCheetah2(){
        return new Cheetah();
    }
}

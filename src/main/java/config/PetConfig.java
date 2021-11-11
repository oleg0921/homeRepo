package config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import pet.Cheetah;
import pet.Spider;


@Configuration
@ComponentScan(basePackages = {"pet"}, excludeFilters = {
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

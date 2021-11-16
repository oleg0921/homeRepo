package com.epam.spinng.homework2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.epam.spinng.homework2.other.OtherBeanB;
import com.epam.spinng.homework2.other.OtherBeanC;

@Configuration
@ComponentScan("com.epam.spinng.homework2.other")
@Import(PetConfig.class)
public class OtherConfig {

    @Bean
    public OtherBeanB otherBeanB(){
        return new OtherBeanB();
    }

    @Bean
    public OtherBeanC otherBeanC() {
        return new OtherBeanC();
    }
}

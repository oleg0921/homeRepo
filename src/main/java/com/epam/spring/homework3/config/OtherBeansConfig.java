package com.epam.spring.homework3.config;
import com.epam.spring.homework3.beans.BeanF;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("application.properties")
@ComponentScan("com.epam.spring.homework3.beans")
@Import(OtherBeansConfig.class)
public class OtherBeansConfig {

    @Bean
    @Lazy
    public BeanF getBeanF() {
        return new BeanF();
    }
}

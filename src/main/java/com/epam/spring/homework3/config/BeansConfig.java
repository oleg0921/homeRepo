package com.epam.spring.homework3.config;

import com.epam.spring.homework3.beans.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;


@Configuration
@PropertySource("application.properties")
@ComponentScan("com.epam.spring.homework3.beans")
@Import(OtherBeansConfig.class)
public class BeansConfig {
    @Bean(
            initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod"
    )
    @DependsOn("beanD")
    public BeanB beanB(){
        return new BeanB();
    }

    @Bean(
            initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod"
    )
    @DependsOn("beanB")
    public BeanC beanC(){
        return new BeanC();
    }

    @Bean(
            initMethod = "customInitMethod",
            destroyMethod = "customDestroyMethod"
    )
    public BeanD beanD(){
        return new BeanD();
    }

    @Bean
    public MyPostProcessor myBeanPostProcessor(){
        return  new MyPostProcessor();
    }

    @Bean
    public MyPostProcessorBeanFactory myBeanFactoryPostProcessor(){return new MyPostProcessorBeanFactory();}


}

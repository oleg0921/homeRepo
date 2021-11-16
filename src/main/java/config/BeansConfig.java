package config;

import beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class BeansConfig {


    @Bean
    public BeanA beanA(){
        return new BeanA();
    }

    @Bean
    public BeanE beanE(){
        return new BeanE();
    }


    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @DependsOn({"beanD"})
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    @DependsOn({"beanB"})
    public BeanC getBeanC() {

        return new BeanC();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanD getBeanD() {
        return new BeanD();
    }
}

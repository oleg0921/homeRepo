package com.epam.spring.homework3;

import com.epam.spring.homework3.config.BeansConfig;
import com.epam.spring.homework3.config.OtherBeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        String[] allBeanNames = context.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            System.out.println(beanName);
            System.out.println(context.getBean(beanName));
        }
    }
}

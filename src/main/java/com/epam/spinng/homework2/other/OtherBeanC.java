package com.epam.spinng.homework2.other;

import com.epam.spinng.homework2.beans.BeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OtherBeanC {


    @Autowired
    private BeanC beanC;

    public OtherBeanC() {
        System.out.println(beanC);
    }
}

package com.epam.spinng.homework2.pet;
import com.epam.spinng.homework2.abstraction.Animal;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Cat implements Animal {

    public Cat(){

    }

    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}

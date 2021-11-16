package com.epam.spinng.homework2.pet;


import com.epam.spinng.homework2.abstraction.Animal;
import org.springframework.stereotype.Component;

@Component
public class Spider implements Animal {

    public Spider(){

    }


    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}

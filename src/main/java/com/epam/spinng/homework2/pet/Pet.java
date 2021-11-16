package com.epam.spinng.homework2.pet;

import com.epam.spinng.homework2.abstraction.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {

    @Autowired
    private List<Animal> pet;

    public void printPets() {

        for (Animal animal : pet){
            System.out.println(animal.getAnimalName());
        }
    }
}

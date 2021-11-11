package pet;

import abstraction.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ComponentScan("pet")
public class Pet {

    @Autowired
    private List<Animal> pet;

    public void printPets() {

        for (Animal animal : pet){
            System.out.println(animal.getAnimalName());
        }
    }
}

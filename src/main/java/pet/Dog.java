package pet;


import abstraction.Animal;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Dog implements Animal {


    public Dog(){

    }


    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}

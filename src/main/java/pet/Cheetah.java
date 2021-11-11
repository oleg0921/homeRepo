package pet;

import abstraction.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cheetah implements Animal {

    public Cheetah() {
    }



    @Override
    public String getAnimalName() {
        return this.getClass().getSimpleName();
    }
}

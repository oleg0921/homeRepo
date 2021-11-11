package pet;


import abstraction.Animal;
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

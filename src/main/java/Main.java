import config.BeansConfig;
import config.PetConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pet.Pet;


public class Main {

    public static  void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);

        Pet pet = ctx.getBean(Pet.class);
        pet.printPets();

    }
}

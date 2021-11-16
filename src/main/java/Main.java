import com.epam.spinng.homework2.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.epam.spinng.homework2.pet.Pet;


public class Main {

    public static  void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfig.class);

        Pet pet = ctx.getBean(Pet.class);
        pet.printPets();

    }
}

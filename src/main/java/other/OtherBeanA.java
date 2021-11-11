package other;

import beans.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OtherBeanA {

    private BeanA beanA;

    public OtherBeanA() {
    }

    @Autowired
    public OtherBeanA(BeanA beanA) {
        this.beanA = beanA;
        System.out.println(this.getClass().getSimpleName() + ". " + beanA.getClass().getSimpleName() + " was injected through the constructor");
    }
}

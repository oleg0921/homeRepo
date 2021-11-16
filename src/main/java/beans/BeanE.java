package beans;


import org.springframework.stereotype.Component;

@Component
public class BeanE {
    private String name;
    private int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public BeanE() {
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}

package config;
import beans.BeanF;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("application.properties")
@ComponentScan("beans")
@Import(OtherBeansConfig.class)
public class OtherBeansConfig {

    @Bean
    @Lazy
    public BeanF getBeanF() {
        return new BeanF();
    }
}

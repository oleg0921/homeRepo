package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import other.OtherBeanB;
import other.OtherBeanC;

@Configuration
@ComponentScan("other")
@Import(PetConfig.class)
public class OtherConfig {

    @Bean
    public OtherBeanB otherBeanB(){
        return new OtherBeanB();
    }

    @Bean
    public OtherBeanC otherBeanC() {
        return new OtherBeanC();
    }
}

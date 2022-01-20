package demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("singleton")
@ComponentScan(basePackages = "demo")
public class BeanConfig {
    @Bean
    public Doctor doctor()
    {
        return new Doctor();
    }
}

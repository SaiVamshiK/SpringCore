package demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "demo")
@Scope("singleton")
public class BeanConfig {
    @Bean
    public Doctor doctor()
    {
        return new Doctor();
    }
}

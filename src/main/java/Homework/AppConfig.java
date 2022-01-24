package Homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public ICar getBmw(){
        return new Car("Bmw",220);
    }
    @Bean
    public ICar getCitroen(){
        return new Car("Citroen",200);
    }
    @Bean
    public ICar getReno(){
        return new Car("Reno",180);
    }
}

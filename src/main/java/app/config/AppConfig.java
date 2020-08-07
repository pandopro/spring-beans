package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public static AnimalsCage animalsCage(@Qualifier("Dog") Animal animal, Timer timer) {
        return new AnimalsCage(animal, timer);
    }

}

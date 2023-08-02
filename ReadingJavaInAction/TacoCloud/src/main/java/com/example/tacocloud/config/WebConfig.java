package com.example.tacocloud.config;

import com.example.tacocloud.ingredient.Ingredient;
import com.example.tacocloud.ingredient.IngredientType;
import com.example.tacocloud.repository.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
    }
    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return args -> {
            repo.save(new Ingredient("FLTO", "Flour Tortilla", IngredientType.WRAP));
            repo.save(new Ingredient("COTO", "Corn Tortilla", IngredientType.WRAP));
            repo.save(new Ingredient("GRBF", "Ground Beef", IngredientType.PROTEIN));
            repo.save(new Ingredient("CARN", "Carnitas", IngredientType.PROTEIN));
            repo.save(new Ingredient("TMTO", "Diced Tomatoes", IngredientType.VEGGIES));
            repo.save(new Ingredient("LETC", "Lettuce", IngredientType.VEGGIES));
            repo.save(new Ingredient("CHED", "Cheddar", IngredientType.CHEESE));
            repo.save(new Ingredient("JACK", "Monterrey Jack", IngredientType.CHEESE));
            repo.save(new Ingredient("SLSA", "Salsa", IngredientType.SAUCE));
            repo.save(new Ingredient("SRCR", "Sour Cream", IngredientType.SAUCE));
        };
    }
}

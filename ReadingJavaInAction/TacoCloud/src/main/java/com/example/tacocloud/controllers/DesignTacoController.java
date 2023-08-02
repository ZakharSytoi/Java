package com.example.tacocloud.controllers;

import com.example.tacocloud.ingredient.Ingredient;
import com.example.tacocloud.ingredient.IngredientType;
import com.example.tacocloud.repository.IngredientRepository;
import com.example.tacocloud.taco.Taco;
import com.example.tacocloud.tacoOrder.TacoOrder;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {
    private final IngredientRepository ingredientRepo;
    @Autowired
    public DesignTacoController(
            IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        Iterable<Ingredient> ingredients = ingredientRepo.findAll();
        List<Ingredient> ingredientlist = new ArrayList<>();
        ingredients.forEach(ingredientlist::add);
        for (IngredientType type : IngredientType.values()) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByIngredientType(ingredientlist, type));
        }
    }

    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order() {
        return new TacoOrder();
    }

    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @GetMapping()
    public String showDesignForm() {
        return "design";
    }

    @PostMapping
    public String processTaco(@Valid Taco taco, Errors error,
                              @ModelAttribute TacoOrder tacoOrder) {
        if (error.hasErrors()) {
            log.info(error.toString());
            return "design";
        }
        tacoOrder.addTaco(taco);

        log.info("Processing taco: {}", taco);
        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByIngredientType(List<Ingredient> ingredientList, IngredientType type) {
        return ingredientList
                .stream()
                .filter(element -> element.getType().equals(type))
                .collect(Collectors.toList());
    }
}

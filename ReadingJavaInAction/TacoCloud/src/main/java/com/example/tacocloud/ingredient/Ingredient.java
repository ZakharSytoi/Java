package com.example.tacocloud.ingredient;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingredient {
    private String id;
    private String name;
    private IngredientType type;
}

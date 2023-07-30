package com.example.tacocloud.taco;

import com.example.tacocloud.ingredient.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}

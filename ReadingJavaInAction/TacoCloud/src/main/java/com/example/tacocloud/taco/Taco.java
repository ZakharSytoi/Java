package com.example.tacocloud.taco;

import com.example.tacocloud.ingredient.Ingredient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {
    @NotNull
    @Size(min = 5, max = 64, message = "Name must be from 5 to 64 characters long.")
    private String name;
    @NotNull
    @Size(min = 2, message = "Choose at least 2 ingredients please.")
    private List<Ingredient> ingredients;
}

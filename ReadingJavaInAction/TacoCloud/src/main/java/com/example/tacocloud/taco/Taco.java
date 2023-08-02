package com.example.tacocloud.taco;

import com.example.tacocloud.ingredient.Ingredient;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Date;
import java.util.List;
@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Size(min = 5, max = 64, message = "Name must be from 5 to 64 characters long.")
    private String name;
    @Size(min = 2, message = "Choose at least 2 ingredients please.")
    @ManyToMany
    private List<Ingredient> ingredients;
    private Date createdAt;
}

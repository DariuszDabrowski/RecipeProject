package com.github.dariuszdabrowski.recipeproject.services;

import com.github.dariuszdabrowski.recipeproject.commands.RecipeCommand;
import com.github.dariuszdabrowski.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}

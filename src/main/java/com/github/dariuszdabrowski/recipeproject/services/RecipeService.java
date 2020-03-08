package com.github.dariuszdabrowski.recipeproject.services;

import com.github.dariuszdabrowski.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}

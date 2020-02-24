package com.github.dariuszdabrowski.recipeproject.repositories;

import com.github.dariuszdabrowski.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

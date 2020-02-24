package com.github.dariuszdabrowski.recipeproject.repositories;

import com.github.dariuszdabrowski.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}

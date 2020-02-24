package com.github.dariuszdabrowski.recipeproject.repositories;

import com.github.dariuszdabrowski.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}

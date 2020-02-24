package com.github.dariuszdabrowski.recipeproject.controllers;

import com.github.dariuszdabrowski.recipeproject.domain.Category;
import com.github.dariuszdabrowski.recipeproject.domain.UnitOfMeasure;
import com.github.dariuszdabrowski.recipeproject.repositories.CategoryRepository;
import com.github.dariuszdabrowski.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository,
                           UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Make some changes...11");
        System.out.println("Category Id is " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasure Id is " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}

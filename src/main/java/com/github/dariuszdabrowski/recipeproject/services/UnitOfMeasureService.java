package com.github.dariuszdabrowski.recipeproject.services;

import com.github.dariuszdabrowski.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}

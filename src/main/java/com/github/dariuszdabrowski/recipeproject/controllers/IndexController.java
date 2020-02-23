package com.github.dariuszdabrowski.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Make some changes...11");
        return "index";
    }
}

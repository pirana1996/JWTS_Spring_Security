package com.auth0.samples.authapi.springbootauthupdated.automobile.controllers;

import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Category;
import com.auth0.samples.authapi.springbootauthupdated.automobile.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RequestMapping("api/categories")
@RestController
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public Collection<Category> findAll() {
        return categoryService.findAll();
    }
}

package com.auth0.samples.authapi.springbootauthupdated.automobile.services;

import com.auth0.samples.authapi.springbootauthupdated.automobile.CategoryRepository;
import com.auth0.samples.authapi.springbootauthupdated.automobile.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Collection<Category> findAll() {
        return categoryRepository.findAll();
    }
}

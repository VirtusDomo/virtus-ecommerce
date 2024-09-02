package com.virtusdev.virtus_ecommerce.service;


import com.virtusdev.virtus_ecommerce.model.Category;
import com.virtusdev.virtus_ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    //private List<Category> categories = new ArrayList<Category>();
    private Long nextId = 1L;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(nextId++);
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Response not Found"));

        categoryRepository.delete(category);
        return "Category with Category Id: " + category.getCategoryId() + " deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {

        Category optionalCategory = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));

        category.setCategoryId(categoryId);
        categoryRepository.save(category);
        return optionalCategory;
    }
}

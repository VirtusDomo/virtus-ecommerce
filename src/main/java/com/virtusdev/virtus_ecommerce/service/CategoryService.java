package com.virtusdev.virtus_ecommerce.service;

import com.virtusdev.virtus_ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long id);
    Category updateCategory(Category category, Long categoryId);
}

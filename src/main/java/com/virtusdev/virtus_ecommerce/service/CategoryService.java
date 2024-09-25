package com.virtusdev.virtus_ecommerce.service;

import com.virtusdev.virtus_ecommerce.dtos.CategoryDTO;
import com.virtusdev.virtus_ecommerce.dtos.CategoryResponse;
import com.virtusdev.virtus_ecommerce.exceptions.ResourceNotFoundException;
import com.virtusdev.virtus_ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO deleteCategory(Long id);
    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}

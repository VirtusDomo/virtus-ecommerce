package com.virtusdev.virtus_ecommerce.repository;

import com.virtusdev.virtus_ecommerce.model.Category;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryName(@NotBlank String categoryName);

}

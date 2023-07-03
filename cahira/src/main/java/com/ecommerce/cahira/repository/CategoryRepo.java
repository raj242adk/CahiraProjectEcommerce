package com.ecommerce.cahira.repository;

import com.ecommerce.cahira.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}

package com.ecommerce.cahira.service;

import com.ecommerce.cahira.entity.Category;
import com.ecommerce.cahira.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }
    public void addCategory(Category category){
        categoryRepo.save(category);
    }

    public void removeCategoryById(Integer id){
        categoryRepo.deleteById(id);
    }

    public Optional<Category> getCategoryById(Integer id){
        return categoryRepo.findById(id);
    }

}

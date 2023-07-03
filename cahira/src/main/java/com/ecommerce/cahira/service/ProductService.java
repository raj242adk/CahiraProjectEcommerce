package com.ecommerce.cahira.service;

import com.ecommerce.cahira.entity.Product;
import com.ecommerce.cahira.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
     ProductRepo productRepo;

    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }
    public void addProduct(Product product){
         productRepo.save(product);
    }
    public void removeProductById(Long id){
        productRepo.deleteById(id);

    }
    public Optional<Product> getProductById(Long id){
        return productRepo.findById(id);

    }
    public List<Product> getAllProductsByCategoryId(Integer id){
        return productRepo.findAllByCategory_Id(id);
    }
}


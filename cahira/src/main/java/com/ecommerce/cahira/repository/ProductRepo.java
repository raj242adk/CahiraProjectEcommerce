package com.ecommerce.cahira.repository;

import com.ecommerce.cahira.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Long> {
    List<Product> findAllByCategory_Id(Integer id);

}

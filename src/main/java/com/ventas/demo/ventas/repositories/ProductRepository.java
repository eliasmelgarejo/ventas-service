package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByProductCategory(ProductCategory productCategory);
}

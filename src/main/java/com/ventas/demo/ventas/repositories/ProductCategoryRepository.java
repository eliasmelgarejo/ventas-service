package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}


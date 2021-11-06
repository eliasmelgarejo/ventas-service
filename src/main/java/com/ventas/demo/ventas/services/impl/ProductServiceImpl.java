package com.ventas.demo.ventas.services.impl;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.repositories.ProductCategoryRepository;
import com.ventas.demo.ventas.repositories.ProductRepository;
import com.ventas.demo.ventas.services.ProductService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl extends ServiceBaseGeneric<Product> implements ProductService {

    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;

    public ProductServiceImpl(ProductRepository productRepository,
                              ProductCategoryRepository productCategoryRepository) {
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public JpaRepository getRepository() {
        return productRepository;
    }

    @Override
    public List<Product> findByProductCategory(Long categoryId) {
        return productRepository.findByProductCategory(
                productCategoryRepository.findById(categoryId).orElse(ProductCategory.builder().build())
        );
    }


}

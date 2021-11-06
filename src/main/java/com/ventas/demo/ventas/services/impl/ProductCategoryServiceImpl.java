package com.ventas.demo.ventas.services.impl;


import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.repositories.ProductCategoryRepository;
import com.ventas.demo.ventas.services.ProductCategoryService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryServiceImpl extends ServiceBaseGeneric<ProductCategory>  implements ProductCategoryService{

    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }


    @Override
    public JpaRepository getRepository() {
        return productCategoryRepository;
    }
}

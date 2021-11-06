package com.ventas.demo.ventas.controllers;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.services.ProductCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }


    @GetMapping("/productsCategories")
    public List<ProductCategory> getProductsCategories() {
        return productCategoryService.findAll();
    }
}

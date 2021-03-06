package com.ventas.demo.ventas.controllers;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/products/category/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Long categoryId) {
        return productService.findByProductCategory(categoryId);
    }
}

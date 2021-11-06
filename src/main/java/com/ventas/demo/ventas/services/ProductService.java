package com.ventas.demo.ventas.services;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.services.shared.ServiceBase;

import java.util.List;

public interface ProductService extends ServiceBase<Product> {
    List<Product> findByProductCategory(Long categoryId);
}

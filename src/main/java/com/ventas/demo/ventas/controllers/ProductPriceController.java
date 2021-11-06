package com.ventas.demo.ventas.controllers;

import com.ventas.demo.ventas.entities.ProductPrice;
import com.ventas.demo.ventas.services.ProductPriceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductPriceController {

    private final ProductPriceService service;

    public ProductPriceController(ProductPriceService service) {
        this.service = service;
    }

    @GetMapping("/productPrices")
    public ResponseEntity<Iterable<ProductPrice>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/productPrices/{productId}/{quantity}")
    public ResponseEntity<?> getProductPrice(@PathVariable Long productId, @PathVariable Double quantity) {
        System.out.println("productId: " + productId);
        System.out.println("quantity: " + quantity);
        ProductPrice productPrice = service.findByProductAndQuantity(productId, quantity);
        if(productPrice != null) {
            return ResponseEntity.ok(productPrice);
        }

        return ResponseEntity.notFound().build();
    }
}

package com.ventas.demo.ventas.controllers;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.services.CategoryDiscountRuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoryDiscountRuleController {

    private final CategoryDiscountRuleService service;

    public CategoryDiscountRuleController(CategoryDiscountRuleService service) {
        this.service = service;
    }

    @GetMapping("/categoryDiscountRule/{categoryId}/{quantity}")
    public ResponseEntity<?> getCategoryDiscountRule(@PathVariable Long categoryId, @PathVariable Double quantity) {
        Optional<CategoryDiscountRule> categoryDiscountRule = service.findByProductCategoryAndQuantity(categoryId, quantity);
        if(categoryDiscountRule.isPresent()) {
            return ResponseEntity.ok(categoryDiscountRule.get());
        }
        return ResponseEntity.notFound().build();
    }
}

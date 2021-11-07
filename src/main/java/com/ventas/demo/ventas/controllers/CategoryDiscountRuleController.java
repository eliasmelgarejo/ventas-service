package com.ventas.demo.ventas.controllers;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.services.CategoryDiscountRuleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryDiscountRuleController {

    private final CategoryDiscountRuleService service;

    public CategoryDiscountRuleController(CategoryDiscountRuleService service) {
        this.service = service;
    }

    @GetMapping("/categoryDiscountRule")
    public List<CategoryDiscountRule> FindAll() { return service.findAll(); }

    @GetMapping("/categoryDiscountRule/{categoryId}/{quantity}")
    public ResponseEntity<?> getCategoryDiscountRule(@PathVariable Long categoryId, @PathVariable Double quantity) {
        CategoryDiscountRule categoryDiscountRule = service.findByProductCategoryAndQuantity(categoryId, quantity);
        System.out.println("Category Rule:" + categoryDiscountRule);
        System.out.println("Category Rule:" + categoryDiscountRule.toString());
        System.out.println("Category Rule:" + categoryDiscountRule.toString());
        System.out.println("Category Rule:" + categoryDiscountRule.toString());
        if(categoryDiscountRule != null) {
            return ResponseEntity.ok(categoryDiscountRule);
        }
        return ResponseEntity.notFound().build();
    }
}

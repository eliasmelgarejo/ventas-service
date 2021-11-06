package com.ventas.demo.ventas.services.impl;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.repositories.CategoryDiscountRuleRepository;
import com.ventas.demo.ventas.services.CategoryDiscountRuleService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public class CategoryDiscountRuleServiceImpl extends ServiceBaseGeneric<CategoryDiscountRule>  implements CategoryDiscountRuleService {
    private final CategoryDiscountRuleRepository repository;

    public CategoryDiscountRuleServiceImpl(CategoryDiscountRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Optional<CategoryDiscountRule> findByProductCategoryAndQuantity(Long productCategoryId, Double quantity) {
        return Optional.empty();
    }
}

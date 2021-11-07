package com.ventas.demo.ventas.services.impl;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.entities.ProductCategory;
import com.ventas.demo.ventas.repositories.CategoryDiscountRuleRepository;
import com.ventas.demo.ventas.services.CategoryDiscountRuleService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
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
    public CategoryDiscountRule findByProductCategoryAndQuantity(Long productCategoryId, Double quantity) {
        return repository.findByCategoryIdAndQuantity(productCategoryId, quantity);
    }
}

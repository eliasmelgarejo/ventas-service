package com.ventas.demo.ventas.services;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import com.ventas.demo.ventas.services.shared.ServiceBase;
import java.util.Optional;

public interface CategoryDiscountRuleService extends ServiceBase<CategoryDiscountRule> {
    CategoryDiscountRule findByProductCategoryAndQuantity(Long productCategoryId, Double quantity);
}

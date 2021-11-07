package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryDiscountRuleRepository extends JpaRepository<CategoryDiscountRule,Long> {

    @Query(value = "SELECT * FROM category_discount_rule WHERE product_category_id = :categoryId and :quantity >= min_quantity and :quantity <= max_quantity", nativeQuery = true)
    CategoryDiscountRule findByCategoryIdAndQuantity(@Param("categoryId") Long categoryId,@Param("quantity") Double quantity);
}

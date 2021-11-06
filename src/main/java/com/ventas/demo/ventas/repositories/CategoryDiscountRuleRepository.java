package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryDiscountRuleRepository extends JpaRepository<CategoryDiscountRule,Long> {
    @Query("SELECT cdr FROM CategoryDiscountRule cdr WHERE cdr.category.id = :categoryId and cdr.minQuantity <= :quantity and cdr.maxQuantity >= :quantity")
    Optional<CategoryDiscountRule> findByCategoryIdAndQuantity(@Param("categoryId") Long categoryId,@Param("quantity") Double quantity);
}

package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.CategoryDiscountRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDiscountRuleRepository extends JpaRepository<CategoryDiscountRule,Long> {
}

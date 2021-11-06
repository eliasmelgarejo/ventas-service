package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice,Long> {
    @Query(value = "select * from product_price p where p.product_id = :productId and p.min_quantity <= :quantity and p.max_quantity >= :quantity ", nativeQuery = true)
    ProductPrice findByProductIdAndQuantity(@Param("productId") Long productId,@Param("quantity") Double quantity);
}

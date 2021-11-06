package com.ventas.demo.ventas.repositories;

import com.ventas.demo.ventas.entities.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPriceRepository extends JpaRepository<ProductPrice,Long> {
}

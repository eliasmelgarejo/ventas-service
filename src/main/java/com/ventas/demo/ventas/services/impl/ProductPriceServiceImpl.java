package com.ventas.demo.ventas.services.impl;

import com.ventas.demo.ventas.entities.ProductPrice;
import com.ventas.demo.ventas.repositories.ProductPriceRepository;
import com.ventas.demo.ventas.services.ProductPriceService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductPriceServiceImpl extends ServiceBaseGeneric<ProductPrice> implements ProductPriceService {
    private final ProductPriceRepository productPriceRepository;

    public ProductPriceServiceImpl(ProductPriceRepository productPriceRepository) {
        this.productPriceRepository = productPriceRepository;
    }

    @Override
    public JpaRepository getRepository() {
        return productPriceRepository;
    }

    @Override
    public ProductPrice findByProductAndQuantity(Long productId, Double quantity) {
        return productPriceRepository.findByProductIdAndQuantity(productId, quantity);
    }
}

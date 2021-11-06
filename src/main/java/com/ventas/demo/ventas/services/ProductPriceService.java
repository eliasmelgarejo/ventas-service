package com.ventas.demo.ventas.services;

import com.ventas.demo.ventas.entities.Product;
import com.ventas.demo.ventas.entities.ProductPrice;
import com.ventas.demo.ventas.services.shared.ServiceBase;

import java.util.Optional;

public interface ProductPriceService extends ServiceBase<ProductPrice> {

  Optional<ProductPrice> findByProductAndQuantity(Long productId, Double quantity);

}

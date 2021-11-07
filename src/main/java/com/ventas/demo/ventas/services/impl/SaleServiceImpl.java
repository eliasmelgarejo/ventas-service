package com.ventas.demo.ventas.services.impl;

import com.ventas.demo.ventas.entities.Sale;
import com.ventas.demo.ventas.repositories.SaleRepository;
import com.ventas.demo.ventas.services.SaleService;
import com.ventas.demo.ventas.services.shared.ServiceBaseGeneric;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class SaleServiceImpl extends ServiceBaseGeneric<Sale> implements SaleService {

    private final SaleRepository repository;

    public SaleServiceImpl(SaleRepository repository) {
        this.repository = repository;
    }

    @Override
    public JpaRepository getRepository() {
        return repository;
    }

}

package com.ventas.demo.ventas.services.shared;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public abstract class ServiceBaseGeneric <T> {
    public abstract JpaRepository getRepository();


    public Optional<T> findById(Long id) {
        return getRepository().findById(id);
    }


    public List<T> findAll() {
        return getRepository().findAll();
    }

    public void validate(T entity, ValidationContext context) throws ValidationException {

    }

    @Transactional

    public T create(T entity) throws ValidationException {
        validate(entity, ValidationContext.CREATE);
        return (T) getRepository().save(entity);
    }

    @Transactional
    public T update(T entity) throws ValidationException {
        validate(entity, ValidationContext.UPDATE);
        return (T) getRepository().save(entity);
    }

    @Transactional
    public void delete(T entity) throws ValidationException {
        validate(entity, ValidationContext.DELETE);
        getRepository().delete(entity);
    }
}

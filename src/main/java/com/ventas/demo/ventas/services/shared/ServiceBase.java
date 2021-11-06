package com.ventas.demo.ventas.services.shared;

import java.util.List;
import java.util.Optional;

public interface ServiceBase<T> {

    public Optional<T> findById(Long id);
    public List<T> findAll();
    public void validate(T entity, ValidationContext context) throws ValidationException;
    public T create(T entity) throws ValidationException;
    public T update(T entity) throws ValidationException;
    public void delete(T entity) throws ValidationException;
}

package com.dalmofelipe.mongodb;

import java.util.List;

public interface GenericService<T> {

    T save(T entity);

    List<T> findAll();

    T findById(String id);

}

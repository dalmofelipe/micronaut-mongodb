package com.dalmofelipe.mongodb.core.ports.outgoing;

import com.dalmofelipe.mongodb.core.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);
    List<Product> findAll();
    Optional<Product> findById(String id);
    void deleteById(String id);

}

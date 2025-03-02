package com.dalmofelipe.mongodb.core.ports.incoming;

import com.dalmofelipe.mongodb.core.domain.Product;

import java.util.List;

public interface ProductUseCase {

    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(String id);
    void deleteProduct(String id);

}

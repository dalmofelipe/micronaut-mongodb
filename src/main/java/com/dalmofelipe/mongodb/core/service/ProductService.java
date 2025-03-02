package com.dalmofelipe.mongodb.core.service;

import java.util.List;

import com.dalmofelipe.mongodb.core.domain.Product;
import com.dalmofelipe.mongodb.core.ports.incoming.ProductUseCase;
import com.dalmofelipe.mongodb.core.ports.outgoing.ProductRepository;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class ProductService implements ProductUseCase {

    @Inject
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("produto não encontrado"));
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}

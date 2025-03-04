package com.dalmofelipe.mongodb.infrastructure.config;

import com.dalmofelipe.mongodb.core.ports.incoming.ProductUseCase;
import com.dalmofelipe.mongodb.core.ports.outgoing.ProductRepository;
import com.dalmofelipe.mongodb.core.service.ProductService;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

// Config necessário para o Micronaut injetar a ProductUseCase na ProductController
@Factory
public class ProductConfig {
    
    @Singleton
    ProductUseCase productUseCase(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }
}
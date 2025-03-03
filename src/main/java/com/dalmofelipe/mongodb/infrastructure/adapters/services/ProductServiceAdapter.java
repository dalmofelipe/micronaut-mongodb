package com.dalmofelipe.mongodb.infrastructure.adapters.services;

import com.dalmofelipe.mongodb.core.ports.incoming.ProductUseCase;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class ProductServiceAdapter {

    @Inject
    @Named("productUseCase")
    private ProductUseCase productUseCase;

    @Singleton
    public ProductUseCase getProductUseCase() {
        return productUseCase;
    }
}

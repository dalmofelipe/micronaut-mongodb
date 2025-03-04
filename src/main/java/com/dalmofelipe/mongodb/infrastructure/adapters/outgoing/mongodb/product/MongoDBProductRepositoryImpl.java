package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.dalmofelipe.mongodb.core.domain.Product;
import com.dalmofelipe.mongodb.core.ports.outgoing.ProductRepository;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class MongoDBProductRepositoryImpl implements ProductRepository {

    @Inject
    private MongoDBProductRepository mongoDBProductRepository;

    @Override
    public Product save(Product product) {
        ProductEntity entity = ProductMapper.toEntity(product);
        entity = mongoDBProductRepository.save(entity);
        return ProductMapper.toDomain(entity);
    }

    @Override
    public List<Product> findAll() {
        return mongoDBProductRepository.findAll().stream()
            .map(ProductMapper::toDomain)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<Product> findById(String id) {
        return mongoDBProductRepository.findById(id)
            .map(ProductMapper::toDomain);
    }

    @Override
    public void deleteById(String id) {
        mongoDBProductRepository.deleteById(id);
    }
}

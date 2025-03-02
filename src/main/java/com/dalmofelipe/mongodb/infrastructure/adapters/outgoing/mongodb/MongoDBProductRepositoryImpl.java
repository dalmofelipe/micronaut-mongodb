package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb;

import com.dalmofelipe.mongodb.core.domain.Product;
import com.dalmofelipe.mongodb.core.ports.outgoing.ProductRepository;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Singleton
public class MongoDBProductRepositoryImpl implements ProductRepository {

    @Inject
    private MongoDBProductRepository mongoDBProductRepository;

    @Override
    public Product save(Product product) {
        ProductEntity entity = ProductEntityMapper.toEntity(product);
        entity = mongoDBProductRepository.save(entity);
        return ProductEntityMapper.toDomain(entity);
    }

    @Override
    public List<Product> findAll() {
        return mongoDBProductRepository.findAll().stream()
            .map(ProductEntityMapper::toDomain)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<Product> findById(String id) {
        return mongoDBProductRepository.findById(id)
            .map(ProductEntityMapper::toDomain);
    }

    @Override
    public void deleteById(String id) {
        mongoDBProductRepository.deleteById(id);
    }
}

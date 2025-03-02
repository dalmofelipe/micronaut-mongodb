package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb;

import com.dalmofelipe.mongodb.core.domain.Product;
import com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto.ProductDto;

public class ProductEntityMapper {

    public static ProductEntity toEntity(Product product) {
        ProductEntity entity = new ProductEntity();
        entity.setId(product.getId());
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        return entity;
    }

    public static Product toDomain(ProductEntity entity) {
        Product product = new Product();
        product.setId(entity.getId());
        product.setName(entity.getName());
        product.setPrice(entity.getPrice());
        return product;
    }

    public static Product toDomain(ProductDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }

    public static ProductDto toDto(Product domain) {
        ProductDto dto = new ProductDto();
        dto.setId(domain.getId());
        dto.setName(domain.getName());
        dto.setPrice(domain.getPrice());
        return dto;
    }
}

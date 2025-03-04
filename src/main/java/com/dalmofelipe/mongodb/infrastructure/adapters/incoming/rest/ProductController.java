package com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest;

import java.util.List;

import com.dalmofelipe.mongodb.core.domain.Product;
import com.dalmofelipe.mongodb.core.ports.incoming.ProductUseCase;
import com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto.ProductDto;
import com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.product.ProductMapper;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.validation.Valid;

@Controller("/products")
public class ProductController {

    @Inject
    private ProductUseCase productUseCase;

    @Post
    public ProductDto createProduct(@Valid @Body ProductDto dto) {
        Product product = ProductMapper.toDomain(dto);

        Product productSaved = productUseCase.createProduct(product);

        return ProductMapper.toDto(productSaved);
    }

    @Get
    public List<ProductDto> getAllProducts() {
        return productUseCase.getAllProducts().stream()
            .map(ProductMapper::toDto)
            .toList();
    }

    @Get("/{id}")
    public ProductDto getProduct(String id) {
        Product productFromDb = productUseCase.getProduct(id);

        return ProductMapper.toDto(productFromDb);
    }

    @Delete("/{id}")
    public void deleteProduct(String id) {
        productUseCase.deleteProduct(id);
    }
}

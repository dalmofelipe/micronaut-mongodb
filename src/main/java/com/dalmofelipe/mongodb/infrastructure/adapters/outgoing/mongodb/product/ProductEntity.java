package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.product;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@MappedEntity("products")
@Serdeable
public class ProductEntity {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private BigDecimal price;

}

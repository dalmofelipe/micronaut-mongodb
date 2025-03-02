package com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto;

import java.math.BigDecimal;

import io.micronaut.serde.annotation.SerdeImport;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Serdeable
@SerdeImport(ProductDto.class)
public class ProductDto {
    
    private String id;

    @NotEmpty(message = "preecha o nome")
    @NotNull(message = "nome é obrigatório")
    private String name;

    @NotNull(message = "preço é obrigatório")
    private BigDecimal price;

}

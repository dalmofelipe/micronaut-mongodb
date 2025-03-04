package com.dalmofelipe.mongodb.infrastructure.adapters.incoming.rest.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.micronaut.serde.annotation.SerdeImport;
import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Serdeable
@SerdeImport(CommentDto.class)
@JsonPropertyOrder({"id", "author", "content", "createdAt"})
public class CommentDto {
    
    private String id;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    {
        this.createdAt = LocalDateTime.now();
    }
}

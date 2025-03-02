package com.dalmofelipe.mongodb;

import java.time.LocalDateTime;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
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
@MappedEntity("comments")
public class Comment {
    
    @Id
    @GeneratedValue
    private String id;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    {
        this.createdAt = LocalDateTime.now();
    }
}

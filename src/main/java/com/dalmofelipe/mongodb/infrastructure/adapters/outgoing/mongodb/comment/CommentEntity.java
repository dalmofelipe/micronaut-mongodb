package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.comment;

import java.time.LocalDateTime;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@MappedEntity("comments")
@Serdeable
public class CommentEntity {

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

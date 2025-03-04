package com.dalmofelipe.mongodb.infrastructure.config;

import com.dalmofelipe.mongodb.core.ports.incoming.CommentUseCase;
import com.dalmofelipe.mongodb.core.ports.outgoing.CommentRepository;
import com.dalmofelipe.mongodb.core.service.CommentService;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;

@Factory
public class CommentConfig {
    
    @Singleton
    CommentUseCase commentUseCase(CommentRepository commentRepository) {
        return new CommentService(commentRepository);
    }
}

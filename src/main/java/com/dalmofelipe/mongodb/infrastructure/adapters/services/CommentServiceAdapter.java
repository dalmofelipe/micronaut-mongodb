package com.dalmofelipe.mongodb.infrastructure.adapters.services;

import com.dalmofelipe.mongodb.core.ports.incoming.CommentUseCase;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class CommentServiceAdapter {
    
    @Inject
    @Named("commentUseCase")
    private CommentUseCase commentUseCase;

    @Singleton
    public CommentUseCase getCommentUseCase() {
        return commentUseCase;
    }
}

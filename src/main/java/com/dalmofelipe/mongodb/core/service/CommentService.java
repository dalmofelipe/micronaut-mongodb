package com.dalmofelipe.mongodb.core.service;

import java.util.List;

import com.dalmofelipe.mongodb.core.domain.Comment;
import com.dalmofelipe.mongodb.core.ports.incoming.CommentUseCase;
import com.dalmofelipe.mongodb.core.ports.outgoing.CommentRepository;

public class CommentService implements CommentUseCase {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(String id) {
        return commentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("comentário não encontrado"));
    }
}

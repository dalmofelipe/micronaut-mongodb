package com.dalmofelipe.mongodb.core.ports.incoming;

import java.util.List;

import com.dalmofelipe.mongodb.core.domain.Comment;

public interface CommentUseCase {

    Comment save(Comment comment);
    List<Comment> findAll();
    Comment findById(String id);

}
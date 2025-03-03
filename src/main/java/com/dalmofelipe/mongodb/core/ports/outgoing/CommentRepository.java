package com.dalmofelipe.mongodb.core.ports.outgoing;

import java.util.List;
import java.util.Optional;

import com.dalmofelipe.mongodb.core.domain.Comment;

public interface CommentRepository {
    
    Comment save(Comment comment);
    List<Comment> findAll();
    Optional<Comment> findById(String id);

}

package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.comment;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.dalmofelipe.mongodb.core.domain.Comment;
import com.dalmofelipe.mongodb.core.ports.outgoing.CommentRepository;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class MongoDBCommentRepositoryImpl implements CommentRepository {

    @Inject
    private MongoDBCommentRepository mongoDBCommentRepository;

    @Override
    public Comment save(Comment comment) {
        CommentEntity entity = CommentMapper.domainToEntity(comment);
        CommentEntity savedEntity = mongoDBCommentRepository.save(entity);
        return CommentMapper.entityToDomain(savedEntity);
    }

    @Override
    public List<Comment> findAll() {
        return mongoDBCommentRepository.findAll().stream()
            .map(CommentMapper::entityToDomain)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<Comment> findById(String id) {
        return mongoDBCommentRepository.findById(id)
            .map(CommentMapper::entityToDomain);
    }
}

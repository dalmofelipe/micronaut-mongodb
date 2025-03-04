package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb.comment;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface MongoDBCommentRepository extends CrudRepository<CommentEntity, String> {
    
}

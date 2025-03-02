package com.dalmofelipe.mongodb;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface CommentRepository extends CrudRepository<Comment, String> {

}
package com.dalmofelipe.mongodb.infrastructure.adapters.outgoing.mongodb;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;

@MongoRepository
public interface MongoDBProductRepository extends CrudRepository<ProductEntity, String> {

}

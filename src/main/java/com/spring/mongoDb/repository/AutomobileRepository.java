package com.spring.mongoDb.repository;

import com.spring.mongoDb.model.Automobile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AutomobileRepository extends MongoRepository<Automobile, Integer> {
}

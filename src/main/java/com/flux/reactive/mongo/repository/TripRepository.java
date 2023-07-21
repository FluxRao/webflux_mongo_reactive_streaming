package com.flux.reactive.mongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.flux.reactive.mongo.entity.Trip;

public interface TripRepository extends ReactiveMongoRepository<Trip, String> {

}

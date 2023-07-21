package com.flux.reactive.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flux.reactive.mongo.entity.Trip;
import com.flux.reactive.mongo.repository.TripRepository;

import reactor.core.publisher.Flux;

@Service
public class TripService {

	@Autowired
	private TripRepository tripRepository;

	public Flux<Trip> getAllTrips() {
		return tripRepository.findAll();
	}

}

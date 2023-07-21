package com.flux.reactive.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flux.reactive.mongo.entity.Trip;
import com.flux.reactive.mongo.service.TripService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value="/trips")
@CrossOrigin
public class TripController {

	@Autowired
	private TripService tripService;

	@GetMapping("")
	public Flux<Trip> getAllTrips() {
		try {
			return tripService.getAllTrips();
		} catch (Exception e) {
			return Flux.empty();
		}
	}
}

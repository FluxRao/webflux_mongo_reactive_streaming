package com.flux.reactive.mongo.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Field;

public class StationLocation {

	@Field(name = "type")
	private String type;

	@Field(name = "coordinates")
	private List<Float> coordinates;

	public StationLocation() {
		super();
	}

	public StationLocation(String type, List<Float> coordinates) {
		super();
		this.type = type;
		this.coordinates = coordinates;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Float> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(List<Float> coordinates) {
		this.coordinates = coordinates;
	}

}

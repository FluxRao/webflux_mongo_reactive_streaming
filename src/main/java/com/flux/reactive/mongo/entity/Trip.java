package com.flux.reactive.mongo.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "trips")
public class Trip {

	@Id
	@Field(name = "_id")
	private String id;

	@Field(name = "tripduration")
	private Integer tripDuration;

	@Field(name = "start station id")
	private Integer startStationId;

	@Field(name = "start station name")
	private String startStationName;

	@Field(name = "end station id")
	private Integer endStationId;

	@Field(name = "end station name")
	private String endStationName;

	@Field(name = "bikeid")
	private Integer bikeId;

	@Field(name = "usertype")
	private String userype;

	@Field(name = "birth year")
	private Integer birthYear;

	@Field(name = "start station location")
	private StationLocation startStationLocation;

	@Field(name = "end station location")
	private StationLocation endStationLocation;

	@Field(name = "start time")
	private Date startTime;

	@Field(name = "stop time")
	private Date stopTime;

	public Trip() {
		super();
	}

	public Trip(String id, Integer tripDuration, Integer startStationId, String startStationName, Integer endStationId,
			String endStationName, Integer bikeId, String userype, Integer birthYear,
			StationLocation startStationLocation, StationLocation endStationLocation, Date startTime, Date stopTime) {
		super();
		this.id = id;
		this.tripDuration = tripDuration;
		this.startStationId = startStationId;
		this.startStationName = startStationName;
		this.endStationId = endStationId;
		this.endStationName = endStationName;
		this.bikeId = bikeId;
		this.userype = userype;
		this.birthYear = birthYear;
		this.startStationLocation = startStationLocation;
		this.endStationLocation = endStationLocation;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(Integer tripDuration) {
		this.tripDuration = tripDuration;
	}

	public Integer getStartStationId() {
		return startStationId;
	}

	public void setStartStationId(Integer startStationId) {
		this.startStationId = startStationId;
	}

	public String getStartStationName() {
		return startStationName;
	}

	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}

	public Integer getEndStationId() {
		return endStationId;
	}

	public void setEndStationId(Integer endStationId) {
		this.endStationId = endStationId;
	}

	public String getEndStationName() {
		return endStationName;
	}

	public void setEndStationName(String endStationName) {
		this.endStationName = endStationName;
	}

	public Integer getBikeId() {
		return bikeId;
	}

	public void setBikeId(Integer bikeId) {
		this.bikeId = bikeId;
	}

	public String getUserype() {
		return userype;
	}

	public void setUserype(String userype) {
		this.userype = userype;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public StationLocation getStartStationLocation() {
		return startStationLocation;
	}

	public void setStartStationLocation(StationLocation startStationLocation) {
		this.startStationLocation = startStationLocation;
	}

	public StationLocation getEndStationLocation() {
		return endStationLocation;
	}

	public void setEndStationLocation(StationLocation endStationLocation) {
		this.endStationLocation = endStationLocation;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStopTime() {
		return stopTime;
	}

	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}

}

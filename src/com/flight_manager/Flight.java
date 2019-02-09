package com.flight_manager;

import java.util.ArrayList;

public class Flight {
	//unique ID
	private Integer id;
	
	//which airline owns this flight
	private Airline airline;
	
	//from which airport flight takes of
	private Airport airport;
	
	//all seats in this flight
	private ArrayList<Seat> seats;
	
	//city where it takes off from
	private String origin;
	
	//city where the flight is going
	private String destination;
	
	/**
	 * @param id
	 * @param airline
	 * @param airport
	 * @param seats
	 * @param origin
	 * @param destination
	 */
	public Flight(Integer id, Airline airline, Airport airport, ArrayList<Seat> seats, String origin,
			String destination) {
		this.id = id;
		this.airline = airline;
		this.airport = airport;
		this.seats = seats;
		this.origin = origin;
		this.destination = destination;
	}

	/**
	 * @param id
	 * @param airport
	 * @param seats
	 * @param origin
	 * @param destination
	 */
	public Flight(Airport airport, String origin, String destination, Integer id) {
		this.id = id;
		this.airport = airport;
		this.origin = origin;
		this.destination = destination;
	}

	public Flight() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", airline=" + airline + ", seats=" + seats + ", origin=" + origin
				+ ", destination=" + destination + "]";
	}
	
	

}

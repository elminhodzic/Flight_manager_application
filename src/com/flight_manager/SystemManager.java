package com.flight_manager;

import java.util.List;

public class SystemManager {

	private List<Airport> listOfAirports;
	private List<Flight> listOfFlights;
	private List<Airline> listOfAirlines;

	/*
	 * 1. Aerodrom mora imati ime koje se sastoji od tacno tri abecedna znaka.
	 * Nijedna dva aerodroma ne mogu imati isto ime. 2. Avio kompanija ima ime koje
	 * mora imati manje od 6 slova. Nijedna aviokompanija ne moze imati isto ime. 3.
	 * Svaki let se sastoji od sedista organizovanih u redove. Svaki red je oznacen
	 * sa ("A", "B", "C", "D", "E", "F"). Svaki red ima broj sedista u redu. 4.
	 * Svaki let ima aerodrom, odrediste avio kompanije i sjedista. Korisnik moze
	 * -Create airport -Izradite aviokompaniju - Kreiraj let - Rezervisite mjesto na
	 * letu
	 */

	public Airport createAirport(String name) {

		boolean tacnoIme = true;
		boolean dupliA = true;

		if (name.length() != 3) {
			tacnoIme = false;

		}

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) < 'A' && 'Z' < name.charAt(i)) {

				tacnoIme = false;
			}

		}

		return null;
	}

	public Airline createAirline(String name) {
		// TODO implement
		return null;
	}

	public Flight createFlight(String name, String origin, String destination, Integer id) {
		// TODO implement
		return null;
	}

	public void createSeats(String airline, Integer flightID, Integer numberOfSeatsPerRow) {
		// TODO implement
	}

	public List<Flight> findAvailableFlights(String origin, String destination) {
		// TODO implement
		return null;
	}

	public boolean bookSeat(String airline, String flightName, int seatNumber, String row) {
		// TODO implement
		return false;
	}

}

package com.flight_manager;

import java.util.List;

public class SystemManager {

	private List<Airport> listOfAirports;
	private List<Flight> listOfFlights;
	private List<Airline> listOfAirlines;

	/*
	 * 1. Aerodrom mora imati ime koje se sastoji od točno tri abecedna znaka.
	 * Nijedna dva aerodroma ne mogu imati isto ime. 2. Avio kompanija ima ime koje
	 * mora imati manje od 6 slova. Nijedna aviokompanija ne može imati isto ime. 3.
	 * Svaki let se sastoji od sedišta organizovanih u redove. Svaki red je označen
	 * sa ("A", "B", "C", "D", "E", "F"). Svaki red ima broj sedišta u redu. 4.
	 * Svaki let ima aerodrom, odredište avio kompanije i sjedišta.     Korisnik
	 * može:   -Create airport   -Izradite aviokompaniju   - Kreiraj let   -
	 * Rezervišite mjesto na letu
	 */

	public Airport createAirport(String name) {
		
		boolean tacnoIme;
		
		if (name.length() != 3) {
				tacnoIme = false;
				
			}
		
		
		for (int i = 0; i < name.length(); i++) {
			
			
			
			if  (name.charAt(i) < 'A' && 'Z' < name.charAt(i)) {
				
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

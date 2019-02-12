package com.flight_manager;

import java.util.ArrayList;
import java.util.List;

public class SystemManager {

	/*
	 * lista koa prikuplja i cuva podatke Airporta
	 */
	private ArrayList<Airport> listOfAirports = new ArrayList<>();

	/*
	 * lista koja prikuplja i cuva podatke od Flights
	 */
	private ArrayList<Flight> listOfFlights = new ArrayList<Flight>();

	/*
	 * lista koja prikuplja i cuva podatke od Airlines
	 */
	private ArrayList<Airline> listOfAirlines = new ArrayList<>();

	Airport airport = new Airport();

	/*
	 * @ metoda koja prima ime i kreira airport sa tim imenom ako su ispunjeni
	 * uslovi za to: ime mora imati 3 velilka abecedna slova i ime nesmije biti isto
	 */

	public ArrayList<Airport> vratiListaAirporta() {

		return listOfAirports;
	}
	
	public ArrayList<Airline> vratiListaAirline (){
		
		return listOfAirlines;
	}

	public Airport createAirport(String name) {

		if (airport.ispravnostDuzineImena(name) && airport.ispravnostKarakteraImena(name)
				&& provjeraDuplikataImenaAirporta(name)) {

			airport = new Airport(name);
			listOfAirports.add(airport);
			return airport;
		}
		return null;
	}
	
	/*
	 * Metoda koja prima ime i kreira airline sa tim imenom ako su uslovi ispunjeni:
	 * ime nesmije biti duzze od 6 slovva i ako se ime vec nalazi u baazi nece ga kreirati
	 */
	public Airline createAirline(String name) {

		if (name.length() > 6) {

			return null;
		}

		for (int i = 0; i < listOfAirlines.size(); i++) {

			if (listOfAirlines.get(i).equals(name)) {
				return null;
			}
		}

		Airline airline = new Airline(name);
		listOfAirlines.add(airline);
		return airline;
	}

	/*
	 * Metoda koja prima ime airporta zatim ime airline, odrediste putovanja i id
	 * broj da bi kreirao let ako su uslovi ispunjeeni
	 */
	public Flight createFlight(Airport name, String seat, String origin, String destination, Integer id, Integer row) {
		// TODO implement

		for (int i = 0; i < listOfFlights.size(); i++) {
			if (id.equals(listOfFlights.get(i).getId()))
				return null;
		}

		Flight flig = new Flight(name, origin, destination, id);
		listOfFlights.add(flig);
		createSeats(seat, id, row);
		return flig;

	}

	/*
	 * Metoda koja prima ime airline, id leta i broj sjedala po kolonama u airline
	 */
	public void createSeats(String airline, Integer flightID, Integer numberOfSeatsPerRow) {
		// TODO implement

		String rows = "ABCDEF";
		ArrayList<Seat> seats = new ArrayList<Seat>();

		Seat seat = new Seat();
		for (int i = 1; i <= rows.length(); i++) {
			for (int j = 0; j < numberOfSeatsPerRow; j++) {

				seat = new Seat(rows, numberOfSeatsPerRow);
				seats.add(seat);
			}
		}

	}

	/*
	 * metoda koja pronalazi slobodan let prima odrediste i destinaciju leeta
	 */
	public List<Flight> findAvailableFlights(String origin, String destination) {
		// TODO implement
		return null;
	}

	public boolean bookSeat(String airline, String flightName, int seatNumber, String row) {
		// TODO implement
		return false;
	}

	public boolean provjeraDuplikataImenaAirporta(String name) {

		for (int i = 0; i < listOfAirports.size(); i++) {

			if (listOfAirports.get(i).getName().equals(name)) {
				return false;
			}
		}
		return true;
	}

	public boolean provjeraDuplikataImenaAirline (String name) {
		
		for (int i = 0; i < listOfAirlines.size(); i++) {
			
			if (listOfAirlines.get(i).getName().equals(name)) {
				return false;
			}
		}
		return true;
	}
}

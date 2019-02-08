package com.flight_manager;

import java.util.ArrayList;
import java.util.List;

public class SystemManager {

	private ArrayList<Airport> listOfAirports = new ArrayList<>();
	private List<Flight> listOfFlights = new ArrayList<Flight>();
	private List<Airline> listOfAirlines = new ArrayList<>();

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

	/*
	 * @ metoda koja prima ime i kreira airport sa tim imenom ako su ispunjeni
	 * uslovi za to
	 */

	public Airport createAirport(String name) {

		boolean duzinaImena = true;
		boolean tacnoIme = true;
		boolean razlicitoIme = true;

		if (name.length() != 3) {

			System.out.println("ime airporta mora biti duzine 3 karaktera");
			duzinaImena = false;
			return null;
		}

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) < 'A' || 'Z' < name.charAt(i)) {

				System.out.println("greska samo veliki karakteri od A do Z");
				tacnoIme = false;
				return null;
			}
		}

		for (int i = 0; i < listOfAirports.size(); i++) {

			if (listOfAirports.get(i).getName().equals(name)) {

				System.out.println("ime se vec nalazi u bazi");
				razlicitoIme = false;
				return null;
			}
		}

		Airport airport = new Airport(name);
		listOfAirports.add(airport);
		return airport;

	}

	/*
	 * Metoda koja prima ime i kreira airline sa tim imenom ako su uslovi ispunjeni
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
	public Flight createFlight(String name, String origin, String destination, Integer id) {
		// TODO implement
		return null;
	}

	/*
	 * Metoda koja prima ime airline, id leta i broj sjedala po kolonama u airline
	 */
	public void createSeats(String airline, Integer flightID, Integer numberOfSeatsPerRow) {
		// TODO implement
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

}

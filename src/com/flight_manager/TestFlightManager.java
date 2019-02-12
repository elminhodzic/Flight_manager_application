package com.flight_manager;

import java.util.Scanner;

public class TestFlightManager {

	public static void main(String[] args) {
		// TODO create UI

		Scanner unos = new Scanner(System.in);
		SystemManager m = new SystemManager();

		int opcija = 1;

		/*
		 * while petlja koja vrti program dok se ne unese 0 kako bi zavrsio program
		 */
		while (opcija != 0) {

			System.out.println("1.create airprt");
			System.out.println("2.create airline");
			System.out.println("3.create flight");
			System.out.println("0.exit");
			opcija = unos.nextInt();
			if (opcija < 0 || opcija > 3) {
				System.out.println("pogresan unos");
				System.out.println("1.create airprt");
				System.out.println("2.create airline");
				System.out.println("3.create flight");
				System.out.println("0.exit");
				opcija = unos.nextInt();
			}

			/*
			 * kreirannje airporta
			 */
			if (opcija == 1) {
				System.out.println("unesi ime");
				String ime = unos.next();
				m.createAirport(ime);
			}

			/*
			 * kreiranje airlines
			 */
			if (opcija == 2) {
				System.out.println("unesite ime");
				String ime = unos.next();
				m.createAirline(ime);
			}

			/*
			 * kreiranjee flights
			 */
			if (opcija == 3) {
				System.out.println("unesite ime aerodroma");
				String ime = unos.next();
				System.out.println("unesite let");
				String let = unos.next();
				System.out.println("unesite destinaaciju");
				String dest = unos.next();
				System.out.println("unesite ID");
				Integer id = unos.nextInt();
				//m.createFlight(ime, let, dest, id);
			}
		}

	}

}

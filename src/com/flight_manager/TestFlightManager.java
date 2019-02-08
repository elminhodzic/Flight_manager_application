package com.flight_manager;

import java.util.Scanner;

public class TestFlightManager {

	public static void main(String[] args) {
		// TODO create UI

		Scanner unos = new Scanner(System.in);
		SystemManager m = new SystemManager();

		int opcija = 1;

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

			if (opcija == 1) {
				System.out.println("unesi ime");
				String ime = unos.next();
				m.createAirport(ime);
			}

			if (opcija == 2) {
				System.out.println("unesite ime");
				String ime = unos.next();
				m.createAirline(ime);
			}

			if (opcija == 3) {
				System.out.println("unesite");
			}
		}

	}

}

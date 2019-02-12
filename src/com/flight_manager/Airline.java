package com.flight_manager;

public class Airline {
	
	private String name;

	/*
	 * def konstruktor
	 */
	public Airline () {
		
	}
	
	/**
	 * @param name
	 */
	public Airline(String name) {
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Airline [name=" + name + "]";
	}
	
	public boolean ispravnostDuzineImenaAirline (String name) {
		
		if (name.length() > 6) {
			return false;
		}
		return true;
	}

}

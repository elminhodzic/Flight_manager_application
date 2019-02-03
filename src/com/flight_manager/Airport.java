package com.flight_manager;

public class Airport {
	
	private String name;
	
	
	public Airport() {
		
	}
	
	
	/**
	 * @param name
	 */
	public Airport(String name) {
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
		return "Airport [name=" + name + "]";
	}
	
	

}

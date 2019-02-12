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
	
	public boolean ispravnostDuzineImena (String name) {
		
		if (name.length() != 3) {
			return false;
		}	
		return true;
	}

	public boolean ispravnostKarakteraImena (String name) {
		
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i) < 'A' || 'Z' < name.charAt(i)) {

				System.out.println("greska samo veliki karakteri od A do Z");
				return false;
			}
		}
		return true;	
	}
}

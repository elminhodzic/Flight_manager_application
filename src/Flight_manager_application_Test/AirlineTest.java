package Flight_manager_application_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flight_manager.Airline;

public class AirlineTest {


	Airline airline;
	
	@Before
	public void setUp () {
		
		airline = new Airline();
	}
	
	@Test
	public void shouldReturnFalseIfNameSizeOfAirlineIsIncorrectTest () {
		
		assertFalse(airline.ispravnostDuzineImenaAirline("asdfghj"));
	}
	
	@Test
	public void shouldReturnTrueIfNameSizeOfAirlineIsCorrectTest () {
		
		assertTrue(airline.ispravnostDuzineImenaAirline("asdfg"));
	}
}

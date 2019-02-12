package Flight_manager_application_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.flight_manager.Airport;

public class AirportTest {

	Airport airport;

	@Before
	public void setUp () {
		airport = new Airport();
	}
	
	@Test
	public void shouldReturnFalseifNameOfAirportIsBigerThen3Test () {
		
		assertFalse(airport.ispravnostDuzineImena("abcd"));
	}

	@Test
	public void shouldReturnTrueIfNameOfAirportisLessThen3Test () {
		
		assertTrue(airport.ispravnostDuzineImena("abc"));
	}
	
	@Test
	public void shouldReturnFalseIfNameOfAirportIsNotBigCaracterTest () {
		
		assertFalse(airport.ispravnostKarakteraImena("abc"));
	}
	
	@Test
	public void shouldReturnTrueIfNameOfAirportIsBigCaracterTest () {
		
		assertTrue(airport.ispravnostKarakteraImena("ABC"));
	}
}

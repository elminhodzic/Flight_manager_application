package Flight_manager_application_Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.flight_manager.Airline;
import com.flight_manager.Airport;
import com.flight_manager.SystemManager;

public class SystemManagerTest {

	SystemManager manager;
	Airport airport;
	Airline airline;
	ArrayList<Airport> listaAirport = new ArrayList<>();

	@Before
	public void setUp() {

		manager = new SystemManager();
		manager.vratiListaAirporta().add(new Airport("ABC"));
		manager.vratiListaAirline().add(new Airline("abcde"));
		// listaAirport.add(new Airport("ABC"));

	}
/*
 * Airport Testovi
 */
	@Test
	public void shouldReturnFalseIfNameExistInListTest() {

		assertFalse(manager.provjeraDuplikataImenaAirporta("ABC"));
	}

	@Test
	public void shouldReturnTrueIfNameIsDiferetFromListTest() {

		assertTrue(manager.provjeraDuplikataImenaAirporta("ABD"));
	}
	
	@Test
	public void shouldReturnNotNullIfAirportIsCreatedTest () {
		
		assertNotNull(manager.createAirport("BCD"));
	}
	
	@Test
	public void shouldReturnNullIfAirportIsNotCreatedSameNameInListTest () {
		
		assertNull(manager.createAirport("ABC"));
	}
	
	@Test
	public void shouldReturnNullIfSizeOfNameIsIncorectInCreatingAirportTest () {
		
		assertNull(manager.createAirport("ABCD"));
	}
	
	@Test
	public void shouldReturnNullIfAirportIsNotCreatedAplhabeticProblemTest () {
		
		assertNull(manager.createAirport("abc"));
	}
	
	/*
	 * Airline Testoovi
	 */
	
	
}

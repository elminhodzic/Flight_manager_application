package Flight_manager_application_Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.flight_manager.Airport;
import com.flight_manager.SystemManager;

public class SystemManagerTest {

	SystemManager manager = new SystemManager();
	String name;
	ArrayList<Airport> listaA = new ArrayList<>();
	Airport airport;

	@Before
	public void setUp() {

		// String name;
		manager = new SystemManager();
		airport = new Airport("ABC");
		listaA.add(airport);
	}

	@Test
	public void duuzinaImenaVracaFalsTest() {

		name = "abcd";
		manager.createAirport(name);
		assertNotEquals(3, name.length());

	}

	@Test
	public void duzinaImenaVracaTrueTest() {

		name = "abc";
		manager.createAirport(name);
		assertEquals(3, name.length());
	}

	@Test
	public void ispravnostKaaraketraVracaFalseTest() {

		name = "abc";

		manager.createAirport(name);
		boolean ispravno = true;
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) < 'A' || 'Z' < name.charAt(i)) {

				ispravno = false;
			}
		}
		assertFalse(ispravno);

	}
}

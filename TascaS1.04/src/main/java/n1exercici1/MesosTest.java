package n1exercici1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MesosTest {

	Mesos mesos = new Mesos();
	
	@Test
	public void testMesosPosicions() {
		int posicions = mesos.getMesos().size();
		int posicionsEsperades = 12;
		assertEquals(posicionsEsperades,posicions);
	}

	@Test
	public void testMesosNoNul() {
		assertNotNull(mesos.getMesos());
	}
	
	@Test
	public void testMesosComprovarPosicio() {
		
		String agost = mesos.donarStringPerPosicio(8);
		String agostEsperat = "Agost";
		assertEquals(agostEsperat, agost);
	}

}

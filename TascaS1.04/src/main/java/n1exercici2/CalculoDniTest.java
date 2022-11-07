package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculoDniTest {

	CalculoDni calculoDni = new CalculoDni();
	
	@ParameterizedTest
	@ValueSource(ints = {12930412,34990234,50695849,69705948,19283402,23948593,13948569,59604951,29384058,Integer.MAX_VALUE})
	void calcularLletra_RetornaLletra(int dni) {
		String caracters="TRWAGMYFPDXBNJZSQVHLCKE";
		int residu = dni%23;
		char esperado = caracters.charAt(residu);
		char obtenido = calculoDni.calcularLletra(dni);
		
		assertEquals(esperado, obtenido);
	}


}

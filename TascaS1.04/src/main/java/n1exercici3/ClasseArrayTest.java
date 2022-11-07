package n1exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ClasseArrayTest {

	@ParameterizedTest
	@ValueSource(strings = {"que","de","no","a","la","el"})
	void afegirAlArraytest(String string) {
		
		final ClasseArray classeArray = new ClasseArray();
		
		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () ->{
			classeArray.afegirAlArray(string);
			classeArray.afegirAlArray(string);
			classeArray.afegirAlArray(string);
			classeArray.afegirAlArray(string);
			classeArray.afegirAlArray(string);
			classeArray.afegirAlArray(string);
		});
	}

}

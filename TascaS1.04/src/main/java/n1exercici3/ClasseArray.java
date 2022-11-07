package n1exercici3;

import java.util.Arrays;

public class ClasseArray {

	/*
	 * - Exercici 3
    Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
    Verifica el seu correcte funcionament amb un test jUnit.
	 */
	
	String[] array = new String[5];
	static int posicio =0;
	
	public void afegirAlArray(String string) throws ArrayIndexOutOfBoundsException{
		
		if(posicio > 5) {
			throw new ArrayIndexOutOfBoundsException("L'array no pot contenir més de 10 strings");
		}
		
		array[posicio] = string;
		posicio++;

	}

	@Override
	public String toString() {
		return "ClasseArray [array=" + Arrays.toString(array) + "]";
	}
}

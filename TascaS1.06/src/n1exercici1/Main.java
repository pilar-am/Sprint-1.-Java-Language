package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Exercici 1
		 * Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del mateix tipus,
		 * juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor 
		 * per a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició 
		 * en la crida al constructor.
		 */
		
		Persona persona1 = new Persona("Fernando", "Gonzalez", 30);
		Persona persona2 = new Persona("Anna", "Benítez", 30);
		Persona persona3 = new Persona("Juan", "Sánchez", 30);
		
		NoGenericMethods noGenericMethods = new NoGenericMethods(persona2, persona3, persona1);
		
		
	}

}

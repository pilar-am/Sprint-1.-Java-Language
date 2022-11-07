package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1
			En un grup de música hi ha diferents tipus d’instruments musicals. 
			Hi ha instruments de vent, de corda i de percussió.

			Atributs de la classe instrument: nom, i preu. Métode abstracte: tocar(). 
			Classes filles:
				Instrument de vent per consola: "Està sonant un instrument de vent"
				Instrument de corda: “Està sonant un instrument de corda”
				Instrument de percussió: “Està sonant un instrument de percussió”.

			El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser 
			provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre 
			estàtic d'aquesta. 
		 */

		Instrument corda = new Corda("Mandolina",200);
		Instrument vent = new Vent("Trompeta",100);
		Instrument percussio = new Percussio("Xilofon",200);
		
		//Instància
		corda.tocar();
		vent.tocar();
		percussio.tocar();
		
		System.out.println();
		
		//Atributs estàtics
		System.out.println(Corda.nomStatic);
		System.out.println(Vent.nomStatic);
		System.out.println(Percussio.nomStatic);
	}

}

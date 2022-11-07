package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * - Exercici 1
			En un grup de m�sica hi ha diferents tipus d�instruments musicals. 
			Hi ha instruments de vent, de corda i de percussi�.

			Atributs de la classe instrument: nom, i preu. M�tode abstracte: tocar(). 
			Classes filles:
				Instrument de vent per consola: "Est� sonant un instrument de vent"
				Instrument de corda: �Est� sonant un instrument de corda�
				Instrument de percussi�: �Est� sonant un instrument de percussi�.

			El proc�s de c�rrega d'una classe nom�s t� lloc una vegada. Demostra que la c�rrega pot ser 
			provocada per la creaci� de la primera inst�ncia d'aquesta classe o per l'acc�s a un membre 
			est�tic d'aquesta. 
		 */

		Instrument corda = new Corda("Mandolina",200);
		Instrument vent = new Vent("Trompeta",100);
		Instrument percussio = new Percussio("Xilofon",200);
		
		//Inst�ncia
		corda.tocar();
		vent.tocar();
		percussio.tocar();
		
		System.out.println();
		
		//Atributs est�tics
		System.out.println(Corda.nomStatic);
		System.out.println(Vent.nomStatic);
		System.out.println(Percussio.nomStatic);
	}

}

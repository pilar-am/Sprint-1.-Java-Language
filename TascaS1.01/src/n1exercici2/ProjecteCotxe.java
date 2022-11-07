package n1exercici2;

public class ProjecteCotxe {

	public static void main(String[] args) {

		/*
		 * - Exercici 2
			Crea una classe "Cotxe" amb els atributs: marca, model i potència. 
			La marca ha de ser estàtic final, el model estàtic i la potència final. 
			Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?

			Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic 
			anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” 
			i el mètode frenar() ha de mostrar: “El vehicle està frenant”. 

			Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.
		 */

		Cotxe cotxe = new Cotxe();
		
		System.out.println("Métode no estàtic a partir d'una instància");
		cotxe.accelerar();
		
		System.out.println("\nMétode estàtic a partir de la classe ");
		Cotxe.frenar();
		
	}

}

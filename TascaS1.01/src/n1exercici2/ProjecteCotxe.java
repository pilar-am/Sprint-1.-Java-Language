package n1exercici2;

public class ProjecteCotxe {

	public static void main(String[] args) {

		/*
		 * - Exercici 2
			Crea una classe "Cotxe" amb els atributs: marca, model i pot�ncia. 
			La marca ha de ser est�tic final, el model est�tic i la pot�ncia final. 
			Demostra la difer�ncia entre els tres. N�hi ha algun que es pugui inicialitzar al constructor de la classe?

			Afegeix dos m�todes a la classe "Cotxe". Un m�tode est�tic anomenat frenar() i un altre no est�tic 
			anomenat accelerar(). El m�tode accelerar ha de mostrar per consola: �El vehicle est� accelerant� 
			i el m�tode frenar() ha de mostrar: �El vehicle est� frenant�. 

			Demostra com invocar el m�tode est�tic i el no est�tic des del main() de la classe principal.
		 */

		Cotxe cotxe = new Cotxe();
		
		System.out.println("M�tode no est�tic a partir d'una inst�ncia");
		cotxe.accelerar();
		
		System.out.println("\nM�tode est�tic a partir de la classe ");
		Cotxe.frenar();
		
	}

}

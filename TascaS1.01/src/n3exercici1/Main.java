package n3exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		/*
		 * He aconseguit recollir les dades de redactor i les not�cies,
		 * ingressar les not�cies a un redactor, pujar-li el sou, calcular 
		 * el preu i la puntuaci� de la not�cia.
		 * No he pogut acabar el men�
		 * */
		
		//REDACTOR
		Redactor redactor1 = new Redactor("Fernando", "38229209D");
		Redactor.incrementarSou(1000);
		
		//INGRESAR NOTICIES A redactor1
		redactor1.noticiasIngresar(new Futbol("Gol en el partido", "Lliga", "Madrid", "Benzema"));
		redactor1.noticiasIngresar(new Basquet("Partit d'Eurolliga", "ACB", "Bar�a"));
		redactor1.noticiasIngresar(new F1("Fernando Alonso gana por fin", "Ferrari"));
		redactor1.noticiasIngresar(new Motociclisme("Espargar� gana", "Yamaha"));
		redactor1.noticiasIngresar(new Tenis("Federer se retira", "Roland Garros","Federer","Connors"));
				
		System.out.println(redactor1);

		//MEN�
		System.out.println ("\n-------MEN�---------");
		String menu = "1. Introduir redactor.\n"
				+ "2. Eliminar redactor\n"
				+ "3. Introduir not�cia a un redactor\n"
				+ "4. Eliminar not�cia\n"
				+ "5. Mostrar les not�cies per redactor\n"
				+ "6. Calcular puntuaci� de la not�cia\n"
				+ "7. Calcular preu de la not�cia\n";
		System.out.println (menu);
		
		Scanner entradaEscaner = new Scanner (System.in); 
		System.out.println("Introdueixi un num de l'1 al 7");
		int numMenu = entradaEscaner.nextInt();
		
		switch(numMenu) {
		  case 1:
		    introduirRedactor();
		    break;
		  case 2:
		    // code block
		    break;
		  case 3:
		   
			break;
		  case 4:
			  
			break;
		  case 5:
			  
			break;
		  case 6:
			  
			break;
		  case 7:
			  
			break;
		  default:
		    System.out.println("No ha ingressat un num correcte.");
		}

				
	}

	static void introduirRedactor() {
		
		Scanner entradaEscaner = new Scanner (System.in); 
		
		System.out.println("Introdueixi el nom del redactor");
		String nom = entradaEscaner.nextLine();
		System.out.println("Introdueixi el DNI");
		String dNI= entradaEscaner.nextLine();
		
		new Redactor(nom, dNI);
	}
	
	static void noticiaRedactor() {
		
	}
}

package n3exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		/*
		 * - Exercici 1
		En una redacció de notícies esportives tenen les notícies classificades per esports: 
		futbol, bàsquet, tenis, F1 i motociclisme.

		Classe Redactor: nom, DNI (final), sou (static). Sou actual és de 1500 €. Cada redactor 
		pot treballar en més d’una notícia.

		Classe noticia: titular, text, puntuació i preu. En el moment de crear-se, el text ha d’estar buit.
			* Notícies de futbol: Competició (String), club(String) i jugador(String).
			* Notícies de bàsquet: competició (String) i club(String).
			* notícies de tenis: competició(String) i tenistes(String).
			* notícies d'F1: escuderia(String).
			* notícies de motociclisme: equip(String).

		Per saber el preu de cada notícia: mètode calcularPreuNoticia(). 
		
		A la classe principal s’ha de fer un menú amb les següents opcions:
			1.- Introduir redactor.
			2.- Eliminar redactor.
			3.- Introduir notícia a un redactor.
			4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).
			5.- Mostrar totes les notícies per redactor.
			6.- Calcular puntuació de la notícia.
			7.- Calcular preu-notícia.
		 */
		
		
		
		
		//Crear un ArrayList amb els redactors creats
		List<Redactor> redactors = new ArrayList<>();
		
		//-----SWITCH AMB LES OPCIONS DEL MENÚ-----
		int numMenu;
		String dni;
		do {
			menu();
			
			numMenu = numMenu();
			
			switch(numMenu) {
			  case 1:
			    introduirRedactor(redactors);
			    break;
			  case 2:
				dni = demanarDni();
			    eliminarRedactor(redactors, dni);
			    break;
			  case 3:
				dni = demanarDni();
				introduirNoticia(redactors, dni);
				break;
			  case 4:
				dni = demanarDni();
				eliminarNoticia(redactors, dni);
				break;
			  case 5:
				 dni = demanarDni();
				 mostrarNoticies(redactors, dni);
				break;
//			  //El càlcul l'he fet al moment de crear la notícia
//			  case 6: 
//				break;
//			  case 7:
//				break;
			  default:
			    System.out.println("Fins a la pròxima!");
			}
		}while(numMenu != 6);
		

						
	}
	
	static void menu() {
		System.out.println ("\n-------MENÚ---------");
		String menu = "1. Introduir redactor.\n"
				+ "2. Eliminar redactor\n"
				+ "3. Introduir notícia a un redactor\n"
				+ "4. Eliminar notícia\n"
				+ "5. Mostrar les notícies per redactor\n"
				+ "6. Calcular puntuació de la notícia\n"
				+ "7. Calcular preu de la notícia\n"
				+ "8. Sortir";
		System.out.println (menu);
	}
	
	static int numMenu() {
		Scanner entradaEscaner = new Scanner (System.in); 
		boolean numCorrecte = false;
		int numMenu;
		do {
			System.out.println("Qué vol ingressar/consultar? ");
			numMenu = entradaEscaner.nextInt();
			if (numMenu > 0 && numMenu < 7) {
				numCorrecte = true;
			}
		}while(!numCorrecte);
		
		return numMenu;
	}
	
	static String demanarDni() {
		Scanner entradaEscaner = new Scanner (System.in); 
		String dni;
		
		System.out.println("Introdueixi el DNI del del redactor");
		dni = entradaEscaner.nextLine();
		return dni;
	}

	static void introduirRedactor(List<Redactor> redactors) {
		
		Scanner entradaEscaner = new Scanner (System.in); 
		
		System.out.println("Introdueixi el nom del redactor");
		String nom = entradaEscaner.nextLine();
		System.out.println("Introdueixi el DNI");
		String dNI= entradaEscaner.nextLine();
		
		redactors.add(new Redactor(nom, dNI));
	}
	
	static void eliminarRedactor(List<Redactor> redactors, String dni) {
				
		Iterator<Redactor> iter = redactors.iterator();
		while(iter.hasNext()){
		    if(iter.next().getDNI().equalsIgnoreCase(dni))
		        iter.remove();
		}
	}
	
	static void introduirNoticia(List<Redactor> redactors, String dni) {
		Scanner entrada = new Scanner (System.in);
		
		String titular, categoria, competicio, club, jugador, escuderia, equip, tenista1, tenista2;
		int puntuacio, preu;
		
		Iterator<Redactor> iter = redactors.iterator();
		while(iter.hasNext()){
			Redactor redactor = iter.next();
		    if(redactor.getDNI().equalsIgnoreCase(dni)) {
		    	
		    	System.out.println("Introdueixi la categoría de la notícia: Futbol, Basquet, F1, Motociclisme o Tenis");
				categoria = entrada.nextLine();
				
		    	if(categoria.equals("Futbol")) {
		    		System.out.println("Introdueixi titular");
					titular = entrada.nextLine();
					
					System.out.println("Introdueixi competició");
					competicio = entrada.nextLine();
					
					System.out.println("Introdueixi club");
					club = entrada.nextLine();
					
					System.out.println("Introdueixi jugador");
					jugador = entrada.nextLine();
					
					redactor.noticiasIngresar(new Futbol(titular, competicio, club, jugador));
		    	}
		    	if(categoria.equals("Basquet")) {
		    		
		    		System.out.println("Introdueixi titular");
					titular = entrada.nextLine();
					
					System.out.println("Introdueixi competició");
					competicio = entrada.nextLine();
					
					System.out.println("Introdueixi club");
					club = entrada.nextLine();
					
					redactor.noticiasIngresar(new Basquet(titular, competicio, club));
		    	}
		    	if(categoria.equals("F1")) {
		    		
		    		System.out.println("Introdueixi titular");
					titular = entrada.nextLine();
					
					System.out.println("Introdueixi escuderia");
					escuderia = entrada.nextLine();
					
					redactor.noticiasIngresar(new F1(titular, escuderia));
		    	}
		    	if(categoria.equals("Motociclisme")) {
		    		
		    		System.out.println("Introdueixi titular");
					titular = entrada.nextLine();
					
					System.out.println("Introdueixi equip");
					equip = entrada.nextLine();
		    		
					redactor.noticiasIngresar(new Motociclisme(titular, equip));
		    	}
		    	if(categoria.equals("Tenis")) {
		    		
		    		System.out.println("Introdueixi titular");
					titular = entrada.nextLine();
					
					System.out.println("Introdueixi competició");
					competicio = entrada.nextLine();
					
					System.out.println("Introdueixi tenista");
					tenista1 = entrada.nextLine();
					
					System.out.println("Introdueixi tenista");
					tenista2 = entrada.nextLine();
					
					redactor.noticiasIngresar(new Tenis(titular, competicio, tenista1, tenista2));
		    	}
		    }
		}
	}
	
	static void eliminarNoticia(List<Redactor> redactors, String dni) {
		
		Scanner entrada = new Scanner (System.in); 
		
		System.out.println("Introdueixi titular");
		String titular = entrada.nextLine();
		
		for (int i=0;i< redactors.size(); i++) {
			if(redactors.get(i).getDNI().equals(dni)) {
				for (int j=0; j<redactors.get(i).getNoticias().size(); j++) {
					if (redactors.get(i).getNoticias().get(j).getTitular().equals(titular)) {
						redactors.get(i).getNoticias().remove(j);
					}
				}
			}
		}
	}
	
	static void mostrarNoticies(List<Redactor> redactors, String dni) {
		for (int i=0;i< redactors.size(); i++) {
			if(redactors.get(i).getDNI().equals(dni)) {
				for (int j=0; j<redactors.get(i).getNoticias().size(); j++) {
					System.out.println(redactors.get(i).getNoticias().get(j));
					
				}
				
				
			}
		}
		
	}
	

	
}

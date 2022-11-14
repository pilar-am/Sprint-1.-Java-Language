package n1exercicis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		//Exercici 1  Classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
		System.out.println("LLISTAR ALFABÈTICAMENT CONTINGUT D'UN DIRECTORI");
		
		Path dir = Paths.get("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");

		Path dir2 = Paths.get(args[0]);
		LecturaEscrituraDirectoris.llegirDirectori(dir);
		LecturaEscrituraDirectoris.llegirDirectori(dir2);
		
		//Exercici 2  Llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament)
		//Imprimir en pantalla en ordre alfabètic dins de cada nivell, indicant si és un directori (D) 
		//o un fitxer (F), i la seva última data de modificació.
		System.out.println("\nLLISTAR ALFABÈTICAMENT CONTINGUT D'UN DIRECTORI RECURSIVAMENT");
		
		File directori = new File("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");
		File directori2 = new File(args[0]);
	    
	    	LecturaEscrituraDirectoris.fitxersRecursius(directori, "\t");
	    	LecturaEscrituraDirectoris.fitxersRecursius(directori2, "\t");
	    
	    	//Exercici 3  Guardar les dades a un fitxer.txt
		FileWriter fitxer = null;
		FileWriter fitxer3 = null;
		try {
			fitxer = new FileWriter("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\fitxer.txt");
			fitxer3 = new FileWriter(args[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LecturaEscrituraDirectoris.escriureFitxer(directori, fitxer,"\t");
		LecturaEscrituraDirectoris.escriureFitxer(directori2, fitxer,"\t");
		
		//Exercici 4  Llegir fitxers.txt
		System.out.println("\nLECTURA D'UN FITXER TXT");
	    	File arxiu = new File ("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\quijote.txt");
	    	File arxiu2 = new File (args[3]);
	    
	    	Charset charset = Charset.forName("UTF-8");
	    	LecturaEscrituraDirectoris.llegirFitxersTxt(arxiu, charset);
	    	LecturaEscrituraDirectoris.llegirFitxersTxt(arxiu2, charset);  
	      
	    	//Exercici 5 serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
	    	FileOutputStream fitxer2 = new FileOutputStream("fitxer.ser");
	    	FileOutputStream fitxer4 = new FileOutputStream(args[4]);
	    
        	//Data com a objecte
        	Date data = new Date();
        
        	SerialitzarDeserialitzar serialitzarDeserialitzar = new SerialitzarDeserialitzar();
        
        	serialitzarDeserialitzar.serialitzar(fitxer2, data);
        	serialitzarDeserialitzar.serialitzar(fitxer4, data);
	    
        	FileInputStream fitxerSer = new FileInputStream("fitxer.ser");
        
        	serialitzarDeserialitzar.deserialitzar(fitxerSer);
	}

}

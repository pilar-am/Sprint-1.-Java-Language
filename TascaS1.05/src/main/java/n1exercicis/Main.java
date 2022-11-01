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

		//Exercici 1
		Path dir = Paths.get("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");

		LecturaEscrituraDirectoris.llegirDirectori(dir);
		
		
		//Exercici 2
	    File directori = new File("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");
	    LecturaEscrituraDirectoris.fitxersRecursius(directori, "\t");
	    
	    
	    //Exercici 3
		//File directori = new File("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");
		FileWriter fitxer = null;
		try {
			fitxer = new FileWriter("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\fitxer.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LecturaEscrituraDirectoris.escriureFitxer(directori, fitxer,"\t");
		
		
		//Exercici 4
	    File arxiu = new File ("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\quijote.txt");;
	    Charset charset = Charset.forName("UTF-8");
	    LecturaEscrituraDirectoris.llegirFitxersTxt(arxiu, charset);
	      
	      
	    //Exercici 5 
	    FileOutputStream fitxer2 = new FileOutputStream("fitxer.ser");
	    
        //Data com a objecte
        Date data = new Date();
        
        SerialitzarDeserialitzar serialitzarDeserialitzar = new SerialitzarDeserialitzar();
        
        serialitzarDeserialitzar.serialitzar(fitxer2, data);
	    
        FileInputStream fitxerSer = new FileInputStream("fitxer.ser");
        
        serialitzarDeserialitzar.deserialitzar(fitxerSer);
        
	    
	    
	}

}

package n1exercicis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class LecturaEscrituraDirectoris {

	//Exercici 1
	public static void llegirDirectori(Path dir) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		    for (Path file: stream) {
		        System.out.println(file.getFileName());
		    }
		} catch (IOException x) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(x);
		}
	}
	
	//Exercici 2
    public static void fitxersRecursius(File directori, String separador) {
        File[] fitxers = directori.listFiles();
        if(fitxers != null){
            for (int x = 0; x < fitxers.length; x++) {
            	if(fitxers[x].isDirectory()) {
            		System.out.println(separador + fitxers[x].getName() + " " + fitxers[x].lastModified() +  " D");
            	}else {
            		System.out.println(separador + fitxers[x].getName() + " " + fitxers[x].lastModified()  + " F");
            	}
                if (fitxers[x].isDirectory()) {
                    String nou_separador = separador + " ";
                    fitxersRecursius(fitxers[x], nou_separador);
                }
            }
        }
    }
    
	//Exercici 3
    public static void escriureFitxer(File directori, FileWriter fitxer, String separador) {
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter(fitxer);
            
            File[] fitxers = directori.listFiles();
            if(fitxers != null){
                for (int x = 0; x < fitxers.length; x++) {
                	if(fitxers[x].isDirectory()) {
                		pw.println(separador + fitxers[x].getName() + " " + fitxers[x].lastModified() +  " D");
                	}else {
                		pw.println(separador + fitxers[x].getName() + " " + fitxers[x].lastModified()  + " F");
                	}
                    if (fitxers[x].isDirectory()) {
                        String nou_separador = separador + " ";
                        escriureFitxer(fitxers[x], fitxer, nou_separador);
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           
           if (null != fitxer)
              fitxer.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
        }
    }
    
    
    //Exercici 4
    public static void llegirFitxersTxt(File arxiu, Charset charset) {
        try {
            
        	FileReader fr = null;
  	      	BufferedReader br = null;
            fr = new FileReader(arxiu, charset);
            
            br = new BufferedReader(fr);

            // Lectura del fitxer
            String linea;
            while((linea=br.readLine())!=null)
               System.out.println(linea);
         }
         catch(Exception e){
            e.printStackTrace();
         }
    }

    
    
    
    
	
	
}

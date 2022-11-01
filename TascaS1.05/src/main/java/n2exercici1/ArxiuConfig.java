package n2exercici1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Properties;

public class ArxiuConfig {

	public static final String ARXIU = "config.properties";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			OutputStream sortida = new FileOutputStream(ARXIU);
			Properties propietats = new Properties();
			
			propietats.setProperty("directori", "C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");
			propietats.setProperty("fitxer", "C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\fitxer.txt");
			
			propietats.store(sortida, "Directori / Fitxer");
			
			System.out.println(propietats);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		File directori = new File("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio");
		FileWriter fitxer = null;
		try {
			fitxer = new FileWriter("C:\\Users\\prueba\\Documents\\EclipseWorkSpace\\Directorio\\fitxer.txt");
		} catch (IOException e) {
					// TODO Auto-generated catch block
			e.printStackTrace();
		}
		escriureFitxer(directori, fitxer,"\t");
		
		
	}
	
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

}

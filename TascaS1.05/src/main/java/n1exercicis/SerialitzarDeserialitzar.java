package n1exercicis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialitzarDeserialitzar {

	public void serialitzar(FileOutputStream fitxer, Date data) {
		  try {
			  ObjectOutputStream sos = new ObjectOutputStream(fitxer);
			  sos.writeObject("Data actual");
			  sos.writeObject(data);
			  sos.close();
		  }
		  catch (FileNotFoundException ex) {
			  ex.printStackTrace();
		  }
		  catch (IOException ex1) {
			  ex1.printStackTrace();
		  }
	}
	
	public void deserialitzar(FileInputStream fitxer) {
		
        try {
            
            ObjectInputStream sis = new ObjectInputStream(fitxer);
            System.out.println((String)sis.readObject());
            System.out.println((Date)sis.readObject());
            sis.close();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
	}

	
  
  
  
}

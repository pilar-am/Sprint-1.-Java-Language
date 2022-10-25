package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class Redactor {
	
	private String nom;
	private final String DNI;
	private static int sou = 1500;
	
	private ArrayList<Noticia> noticias = new ArrayList();
	
	public Redactor(String nom, String dNI) {
		this.nom = nom;
		DNI = dNI;
	}

	public Redactor(String nom, String dNI, ArrayList<Noticia> noticias) {
		super();
		this.nom = nom;
		DNI = dNI;
		this.noticias = noticias;
	}
	
	public static void incrementarSou(int increment) {
		Redactor.sou += increment;
	}

	public void noticiasIngresar(Noticia noticia) {
		noticia.calcularPreuNoticia();
		noticia.calcularPuntuacioNoticia();
		noticias.add(noticia);
	}

	@Override
	public String toString() {
		return "REDACTOR\nNom = " + nom + "\nDNI= " + DNI + "\nNoticias: " + noticias + " ";
	}
	

	
	
	
	
	
	
}

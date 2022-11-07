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

	
	
	public String getNom() {
		return nom;
	}

	public static int getSou() {
		return sou;
	}

	public static void setSou(int sou) {
		Redactor.sou = sou;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}
	

	public String getDNI() {
		return DNI;
	}

	@Override
	public String toString() {
		return "Nom = " + nom + "  DNI= " + DNI + "  Noticias: " + noticias + " ";
	}
	

	
	
	
	
	
	
}

package n3exercici1;

import java.util.Arrays;

public class Tenis extends Noticia{

	private String competicio;
	private String[] tenistes = new String[2];
	private int puntuacio;
	private int preu;
		
	public Tenis(String titular, String competicio, String tenista1, String tenista2) {
		super(titular);
		this.competicio = competicio;
		this.tenistes[0]= tenista1;
		this.tenistes[1]= tenista2;
		this.puntuacio = 4;
		this.preu = 150;
	}
	@Override
	public int calcularPreuNoticia() {
		
		for (int i=0; i<tenistes.length; i++) {
			if(this.tenistes[i].equals("Federer") || this.tenistes[i].equals("Nadal") || this.tenistes[i].equals("Djokovic")) {
				this.preu += 100;
			}
		}
		return this.preu;
	}
	@Override
	public int calcularPuntuacioNoticia() {
		for (int i=0; i<tenistes.length; i++) {
			if(this.tenistes[i].equals("Federer") || this.tenistes[i].equals("Nadal") || this.tenistes[i].equals("Djokovic")) {
				this.puntuacio += 3;
			}
		}
		
		return puntuacio;
	}
	@Override
	public String toString() {
		return "Tenis [competicio=" + competicio + ", tenistes=" + Arrays.toString(tenistes) + ", puntuacio="
				+ puntuacio + ", preu=" + preu + "]";
	}
	
	
	
}

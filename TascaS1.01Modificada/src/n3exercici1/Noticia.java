package n3exercici1;

public abstract class Noticia {

	private String titular;
	private String text ="";
	
	/*
	private int puntuacio;
	private int preu;
	public Noticia(String titular, int puntuacio, int preu) {
		super();
		this.titular = titular;
		this.puntuacio = puntuacio;
		this.preu = preu;
	}*/

	public Noticia(String titular) {
		this.titular = titular;
	}

	public abstract int calcularPreuNoticia();
	

	public abstract int calcularPuntuacioNoticia();

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}

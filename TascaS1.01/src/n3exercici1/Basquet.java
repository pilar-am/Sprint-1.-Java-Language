package n3exercici1;

public class Basquet extends Noticia{
	
	private String competicio;
	private String club;
	private int puntuacio;
	private int preu;
	
	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.puntuacio = 4;
		this.preu = 250;
	}
	@Override
	public int calcularPreuNoticia() {
		if (this.competicio.equals("Eurolliga")) {
			this.preu += 75;
		}
		if(this.club.equals("Barça") || this.club.equals("Madrid")) {
			this.preu += 100;
		}
		
		return this.preu;	

	}
	@Override
	public int calcularPuntuacioNoticia() {

		if (this.competicio.equals("Eurolliga")) {
			this.puntuacio += 3;
		}else if (this.competicio.equals("ACB")) {
			this.puntuacio += 2;
		}
		if(this.club.equals("Barça") || this.club.equals("Madrid")) {
			this.puntuacio += 1;
		}

		return this.puntuacio;
	}
	@Override
	public String toString() {
		return "Basquet [competicio=" + competicio + ", club=" + club + ", puntuacio=" + puntuacio + ", preu=" + preu
				+ "]";
	}
	
	
}

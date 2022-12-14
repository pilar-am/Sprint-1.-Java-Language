package n3exercici1;

public class Futbol extends Noticia{

	private String competicio;
	private String club;
	private String jugador;
	private int puntuacio;
	private int preu;
	

	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		this.preu = 300;
		this.puntuacio = 5;
	}

	@Override
	public int calcularPreuNoticia() {
		
		if (this.competicio.equals("Lliga de Campions")) {
			this.preu += 100;
		}
		if(this.club.equals("Bar?a") || this.club.equals("Madrid")) {
			this.preu += 100;
		}
		if(this.jugador.equals("Ferran Torres") || this.jugador.equals("Benzema")) {
			this.preu += 50;
		}
		
		return this.preu;
	}

	@Override
	public int calcularPuntuacioNoticia() {
		if (this.competicio.equals("Lliga de Campions")) {
			this.puntuacio += 3;
		}else if (this.competicio.equals("Lliga")) {
			this.puntuacio += 2;
		}
		if(this.club.equals("Bar?a") || this.club.equals("Madrid")) {
			this.puntuacio += 1;
		}
		if(this.jugador.equals("Ferran Torres") || this.jugador.equals("Benzema")) {
			this.puntuacio += 1;
		}
		
		return this.puntuacio;
	}

	@Override
	public String toString() {
		return "Futbol [titular=" +super.getTitular()+ ", competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + ", puntuacio="
				+ puntuacio + ", preu=" + preu + "]";
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	
	
	
	
	

	
	

	
	
	
}

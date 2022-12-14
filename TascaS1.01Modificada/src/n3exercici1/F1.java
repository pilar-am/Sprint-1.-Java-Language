package n3exercici1;

public class F1 extends Noticia{

	private String escuderia;
	private int puntuacio;
	private int preu;
	

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
		this.puntuacio = 4;
		this.preu = 100;
	}
	
	@Override
	public int calcularPreuNoticia() {
	

		if(this.escuderia.equals("Ferrari") || this.escuderia.equals("Mercedes")) {
			this.preu += 50;
		}
		
		return this.preu;	
	}
	@Override
	public int calcularPuntuacioNoticia() {
		if(this.escuderia.equals("Ferrari") || this.escuderia.equals("Mercedes")) {
			this.puntuacio += 2;
		}
		
		return this.puntuacio;
	}

	@Override
	public String toString() {
		return "F1 [escuderia=" + escuderia + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
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

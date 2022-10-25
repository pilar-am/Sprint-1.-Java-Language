package n3exercici1;

public class Motociclisme extends Noticia{

	private String equip;
	private int puntuacio;
	private int preu;
	
		
	public Motociclisme(String titular, String equip) {
		super(titular);
		this.equip = equip;
		this.puntuacio = 3;
		this.preu = 100;
	}
	
	@Override
	public int calcularPreuNoticia() {
		if(this.equip.equals("Honda") || this.equip.equals("Yamaha")) {
			this.preu += 50;
		}
		return this.preu;
	}
	
	@Override
	public int calcularPuntuacioNoticia() {

		if(this.equip.equals("Honda") || this.equip.equals("Yamaha")) {
			this.puntuacio += 2;
		}
		
		return this.puntuacio;
	}

	@Override
	public String toString() {
		return "Motociclisme [equip=" + equip + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
	}
	
	
	
	
}

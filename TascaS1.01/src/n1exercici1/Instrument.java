package n1exercici1;

public abstract class Instrument {

	private String nom;
	private double preu;
	
	//public static String nomStatic = "Instrument";
		
	public Instrument(String nom, double preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}
	
	public abstract void tocar();
	
	
	
	
}

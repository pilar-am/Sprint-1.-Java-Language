package n1exercici1;

public class Vent extends Instrument{

	public static String nomStatic = "Tuba";
	
	public Vent(String nom, double preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Està tocant un instrument de vent");
		
	}

}

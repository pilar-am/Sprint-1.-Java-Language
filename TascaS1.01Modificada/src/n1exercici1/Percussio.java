package n1exercici1;

public class Percussio extends Instrument{

	public static String nomStatic = "Bombo";
	
	public Percussio(String nom, double preu) {
		super(nom, preu);
		
	}

	@Override
	public void tocar() {
		
		System.out.println("Est� tocant un instrument de percussi�");
	}

}

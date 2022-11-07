package n1exercici1;

public class Corda extends Instrument{

	public static String nomStatic = "Guitarra";
	
	public Corda(String nom, double preu) {
		super(nom, preu);
		
	}

	@Override
	public void tocar() {
		System.out.println("Està tocant un instrument de corda");
		
	}

}

package n1exercici1;

public class Corda extends Instrument{

	public static String nomStatic = "Guitarra";
	
	public Corda(String nom, double preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tocar() {
		System.out.println("Està tocant un instrument de corda");
		
	}

}

package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{

	public Smartphone(String marca, String model) {
		super(marca, model);
	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub
		System.out.println("Est� sonant l'alarma");
	}

	@Override
	public void fotografiar() {
		// TODO Auto-generated method stub
		System.out.println("S'est� fent una foto");
	}

}

package n2exercici1;

public class Telefon {
	
	private String marca;
	private String model;
	
	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}
	
	public void trucar(String telefon) {
		System.out.println("Està trucant al num: "+ telefon);
	}
	
	
}

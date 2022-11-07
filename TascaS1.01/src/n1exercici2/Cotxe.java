package n1exercici2;

public class Cotxe {

	private static final String marca = "Audi";
	private static String model = "A4";
	private final int potencia = 3000;
	
	//No es poden inicialitzar al constructor
	
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
}

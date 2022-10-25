package n1exercici1;

public class instMusicals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instrument corda = new Corda("Mandolina",200);
		Instrument vent = new Vent("Trompeta",100);
		Instrument percussio = new Percussio("Xilofon",200);
		
		//Instància
		corda.tocar();
		vent.tocar();
		percussio.tocar();
		
		System.out.println();
		
		//Atributs estàtics
		System.out.println(Corda.nomStatic);
		System.out.println(Vent.nomStatic);
		System.out.println(Percussio.nomStatic);
	}

}

package n3exercici1;

public class Generica <E extends Smartphone & Telefon>{

	public <T extends Telefon> void primerMetode(E p) {
		System.out.println("Entrant al primer mètode");
		
		p.trucar();
		p.ferFotos();
	}
	
	public <T extends Smartphone> void segonMetode(E p) {
		System.out.println("Entrant al segon mètode");
		
		p.trucar();
		p.ferFotos();
	}	
}

package n1exercici1;

public class Main {

	public static void main(String[] args) {
		
		//Es creen dos vendes
		Venda venda1 = new Venda();
		Venda venda2 = new Venda();
		
		//A la venda1 li afegim 2 productes i calculem el preu total
		venda1.afegirProducte(new Producte("Laptop", 200));
		venda1.afegirProducte(new Producte("Ratolí", 35));
		
		try {
			venda1.calcularTotal();
		}catch(VendaBuidaException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("El preu total de la venda 1 és: " + venda1.getPreuTotal() + " €\n");
		
		//Calculem el preu total de la venda2 i com no hi
		//han productes llença l'excepció
		try {
			venda2.calcularTotal();
		}catch(VendaBuidaException e){
			System.out.println(e.getMessage());
		}
		
		
		//Capturar excepció ArrayIndexOutOfBoundsException
		int[] numeros = new int[5];
		
		try {
			for(int i=0; i<=numeros.length;i++) {
				numeros[i]=i;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

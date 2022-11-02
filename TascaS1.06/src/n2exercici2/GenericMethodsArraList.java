package n2exercici2;

import java.util.ArrayList;

public class GenericMethodsArraList <E>{
	
	private ArrayList<E> elements = new ArrayList<>();

	public ArrayList<E> getElements() {
		return elements;
	}

	public void afegirElements(E p) {
		elements.add(p);
	}
	
    public void mostrarElements(){
        for (E p: elements){
            System.out.println(p);
        }
    }
	
	@Override
	public String toString() {
		return "GenericMethodsArraList [elements=" + elements + "]";
	}
	
}

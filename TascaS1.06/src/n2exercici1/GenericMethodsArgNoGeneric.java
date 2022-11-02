package n2exercici1;

public class GenericMethodsArgNoGeneric <E>{

	private E element1;
	private E element2;
	private String elemNoGeneric;
	
	
	public GenericMethodsArgNoGeneric(E element1, E element2, String elemNoGeneric) {
		this.element1 = element1;
		this.element2 = element2;
		this.elemNoGeneric = elemNoGeneric;
	}


	public E getElement1() {
		return element1;
	}


	public void setElement1(E element1) {
		this.element1 = element1;
	}


	public E getElement2() {
		return element2;
	}


	public void setElement2(E element2) {
		this.element2 = element2;
	}


	public String getElemNoGeneric() {
		return elemNoGeneric;
	}


	public void setElemNoGeneric(String elemNoGeneric) {
		this.elemNoGeneric = elemNoGeneric;
	}

	
}

package n1exercici2;

public class GenericMethods <E>{

	private E element1;
	private E element2;
	private E element3;
	
	
	public GenericMethods(E element1, E element2, E element3) {
		this.element1 = element1;
		this.element2 = element2;
		this.element3 = element3;
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


	public E getElement3() {
		return element3;
	}


	public void setElement3(E element3) {
		this.element3 = element3;
	}
	
}

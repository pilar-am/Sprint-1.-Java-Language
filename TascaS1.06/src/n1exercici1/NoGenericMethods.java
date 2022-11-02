package n1exercici1;

public class NoGenericMethods {

	Persona persona1;
	Persona persona2;
	Persona persona3;
	
	public NoGenericMethods(Persona persona1, Persona persona2, Persona persona3) {
		super();
		this.persona1 = persona1;
		this.persona2 = persona2;
		this.persona3 = persona3;
	}

	public Persona getPersona1() {
		return persona1;
	}

	public void setPersona1(Persona persona1) {
		this.persona1 = persona1;
	}

	public Persona getPersona2() {
		return persona2;
	}

	public void setPersona2(Persona persona2) {
		this.persona2 = persona2;
	}

	public Persona getPersona3() {
		return persona3;
	}

	public void setPersona3(Persona persona3) {
		this.persona3 = persona3;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [persona1=" + persona1 + ", persona2=" + persona2 + ", persona3=" + persona3 + "]";
	}
	
	
}

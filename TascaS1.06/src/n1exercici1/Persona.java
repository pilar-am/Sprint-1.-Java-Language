package n1exercici1;

public class Persona {

	String nom;
	String cognom;
	int edat;
	
	public Persona(String nom, String cognom, int edat) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + "]";
	}
	
	
	
}

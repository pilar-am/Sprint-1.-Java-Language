package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mesos {


	List<String> mesos = new ArrayList<>();
	
	public Mesos() {
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
	}
	
	@Override
	public String toString() {
		return "Mesos: " + mesos;
	}

	public List<String> getMesos() {
		return mesos;
	}

	public String donarStringPerPosicio(int posicio) {
		posicio = posicio - 1;
		String mes;
		mes = mesos.get(posicio);
		
		return mes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mesos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesos other = (Mesos) obj;
		return Objects.equals(mesos, other.mesos);
	}
}

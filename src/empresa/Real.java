package empresa;

public class Real extends Moeda {

	public Real() {

	}

	public void info() {

	}

	
	@Override
	public String toString() {
		return "Real";
	}

	@Override
	public double converter(double valor) {
		return valor;

	}
}

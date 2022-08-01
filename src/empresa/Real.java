package empresa;

public class Real extends Moeda {

	public Real() {

	}

	public void info() {

	}

	
	@Override
	public String toString() {
		return valor + " Reais";
	}

	@Override
	public double converter(double valor) {
		return valor;

	}
}

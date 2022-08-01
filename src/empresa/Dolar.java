package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	public Dolar() {

	}

	public void info() {

	}

	@Override
	public double converter(double valor) {
		return valor * 5;

	}

	@Override
	public String toString() {
		return valor + " Dolares";
	}

}

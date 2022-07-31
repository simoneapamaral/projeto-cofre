package empresa;

public class Dolar extends Moeda {

	public Dolar() {

	}

	public Dolar(double valor) {
		super(valor);
	}

	public void info() {

	}

	@Override
	public double converter(double valor) {
		return valor * 5.17;

	}

	@Override
	public String toString() {
		return "Dolar [valor=" + valor + ", toString()=" + super.toString() + ", getValor()=" + getValor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}

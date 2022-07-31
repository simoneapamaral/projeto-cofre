package empresa;

public abstract class Moeda {
	double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public Moeda() {

	}

	@Override
	public String toString() {
		return "Moeda [valor=" + valor + "]";
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void info() {

	}

	public double converter(double valor) {
		return valor;
	}

}

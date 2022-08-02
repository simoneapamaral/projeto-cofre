package empresa;

public class Euro extends Moeda {

	public Euro() {
	}

	public Euro(double valor) {
		super(valor);

	}

	public void info() {
		System.out.println();
		System.out.println(valor + " Euros adicionado no cofrinho com sucesso!");
		System.out.println();

	}

	@Override
	public double converter(double valor) {
		return valor * 10;

	}

	@Override
	public String toString() {
		return valor + " Euros";
	}

}
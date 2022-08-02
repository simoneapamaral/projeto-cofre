package empresa;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	public Dolar() {

	}

	public void info() {
		System.out.println();
		System.out.println(valor + " Dolares adicionado no cofrinho com sucesso!");
		System.out.println();

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

package empresa;

public class Real extends Moeda {

	public Real() {

	}

	public void info() {
		System.out.println();
		System.out.println(valor + " Reais adicionado no cofrinho com sucesso!");
		System.out.println();

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

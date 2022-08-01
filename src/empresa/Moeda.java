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
		return converter(valor); 
	}

	public void setValor(double valor) {
		if(valor <=0) {
			System.out.println("Valor invalido!\nDigite um valor maior que zero.\n");
		}
		this.valor = valor;
	}

	public void info() {

	}

    public double converter(double valor) {
		return valor;
	}

}

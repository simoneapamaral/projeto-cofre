package empresa;

public abstract class Moeda {
	double valor;


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void info() {
		
	}
	
	public double converter() {
		return valor;
		
	}

}

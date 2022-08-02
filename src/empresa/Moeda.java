package empresa;

public abstract class Moeda {
	double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public Moeda() {

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

	public void info() { // tem que imprimir algo??????
		System.out.println();
		System.out.println("Valor informado: " + valor );
		System.out.println();

	}

    public double converter(double valor) {
		return valor;
	}

}

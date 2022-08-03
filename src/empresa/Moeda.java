package empresa;

public abstract class Moeda { // Classe Moeda classe mãe
	double valor;

	public Moeda(double valor) { // construtor classe Moeda 
		this.valor = valor;
	}

	public Moeda() {} // construtor vazio

	public double getValor() { // método get pega o valor
		return converter(valor);
	}

	public void setValor(double valor) { // método set define o valor
		// verifica se valor é maior que zero
		if (valor <= 0) {
			System.out.println("Valor invalido!\nDigite um valor maior que zero.\n");
		}
		this.valor = valor;
	}

	// metodo info imprime o valor informado que será adicionado ao cofrinho
	public void info() { 
		System.out.println();
		System.out.println("Valor informado: " + valor);
		
	}

	// método converter converte o valor da moeda em reais
	public double converter(double valor) {
		return valor;
	}

}

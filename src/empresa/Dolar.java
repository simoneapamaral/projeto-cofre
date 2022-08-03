package empresa;

public class Dolar extends Moeda { // Classe Dolar classe filha

	public Dolar(double valor) { // construtor classe Dolar
		super(valor); // invoca o construtor da classe mãe Moeda
	}

	public Dolar() {} // construtor vazio

	// metodo info imprime o valor informado e a moeda adicionada no cofrinho
	public void info() {
		System.out.println();
		System.out.println(valor + " Dolares adicionado no cofrinho com sucesso!");
		System.out.println();
	}

	public void infoMoeda() {
		// Trazendo o método info da classe moeda através do super 
		super.info();
	}

	@Override
	// método converter converte o valor da moeda em reais
	public double converter(double valor) {
		return valor * 5.29; // 1 Dólar igual a 5,29 Real brasileiro 3 de agosto de 2022 Horário de Brasília 11:10

	}

	@Override
	public String toString() {
		return valor + " Dolares";
	}

}

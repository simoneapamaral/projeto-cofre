package empresa;

public class Euro extends Moeda { // Classe Euro classe filha

	public Euro(double valor) { // construtor classe Euro
		super(valor); // invoca o construtor da classe mãe Moeda

	}
	
	public Euro() {} // construtor vazio

	// metodo info imprime o valor informado e a moeda adicionada no cofrinho
	public void info() {
		System.out.println();
		System.out.println(valor + " Euros adicionado no cofrinho com sucesso!");
		System.out.println();

	}


	public void infoMoeda() {
		// Trazendo o método info da classe moeda através do super
		super.info();
	}
	
	@Override
	// método converter converte o valor da moeda em reais
	public double converter(double valor) {
		return valor * 5.37; // 1 Euro igual a 5,37 Real brasileiro 3 de agosto de 2022 Horário de Brasília 11:10

	}

	@Override
	public String toString() { // método toString irá imprimir o valor e a moeda
		return valor + " Euros";
	}

}
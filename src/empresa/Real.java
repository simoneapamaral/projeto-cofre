package empresa;

public class Real extends Moeda { // Classe Real classe filha

	public Real(double valor) { // construtor classe Real
		super(valor); // invoca o construtor da classe mãe Moeda
		
	}
	
	public Real() {} // construtor vazio

	// metodo info imprime o valor informado e a moeda adicionada no cofrinho
	public void info() {
		System.out.println();
		System.out.println(valor + " Reais adicionado no cofrinho com sucesso!");
		System.out.println();

	}
	
	public void infoMoeda() {
		// Trazendo o método info da classe moeda através do super
		super.info();
	}
	
	@Override
	public String toString() {
		return valor + " Reais";
	}

	@Override
	// método converter nessa classe por se tratar de real apenas retorna o valor recebido
	public double converter(double valor) {
		return valor;

	}
}

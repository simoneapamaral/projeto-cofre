package empresa;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

	public Cofrinho(ArrayList<Moeda> moedas) {
		this.moedas = moedas;
	}

	public void adicionar(Moeda n) {
		moedas.add(n);
	}

	public void remover(Moeda n) {
		moedas.remove(n);
	}
	public double totalConvertido() {
		double total=0;
		for(Moeda m : moedas) {
			total += m.getValor(); //pegar valor da moeda e incrementar com o total 
			// if dolar * cotação dolar
			// else if euro * cotação do euro
		}
		return total;
	}

	
	
}

package empresa;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

	public Cofrinho(ArrayList<Moeda> moedas) {
		this.moedas = moedas;
	}

	public Cofrinho() {

	}
	


	public void adicionar(ArrayList<Moeda> moeda) {
		this.moedas = moeda;
	}

	public void remover(int moeda) {
		moedas.remove(moeda);

	}

	public double totalConvertido() {
		double total = 0;
		for (Moeda m : moedas) {
			total += m.getValor();
		}
		return total;
	}

	public ArrayList<Moeda> getMoedas() {
		return moedas;
	}

	public void setMoedas(ArrayList<Moeda> moedas) {
		this.moedas = moedas;
		
	}

	public void imprimirMoedas() {
		if(moedas.size() == 0) {
			System.out.println("Ooops!\nCofrinho vazio :(");
		}
		for (int i = 0; i < this.moedas.size(); i++) {
			System.out.println(this.moedas.get(i));
		}

	}

}

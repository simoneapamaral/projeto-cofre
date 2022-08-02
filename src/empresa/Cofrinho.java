package empresa;

import java.util.ArrayList;

public class Cofrinho { // Classe Cofrinho

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

	public Cofrinho(ArrayList<Moeda> moedas) {
		this.moedas = moedas;
	}

	public Cofrinho() {

	}
	
    // método para adicionar moedas 
	public void adicionar(ArrayList<Moeda> moeda) {
		this.moedas = moeda;
	}

	// método para remover moedas
	public void remover(int moeda) {
		moedas.remove(moeda);

	}
	
	// método para listar moedas que estão no cofrinho
	public void listagemMoedas() {
		if(moedas.size() == 0) {
			System.out.println("Ooops!\nCofrinho vazio :(");
		}
		for (int i = 0; i < this.moedas.size(); i++) {
			System.out.println(this.moedas.get(i));
		}

	}

	// método para somar valor total de moedas convertido em reais no cofrinho
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

}

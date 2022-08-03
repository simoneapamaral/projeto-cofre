package empresa;

import java.util.ArrayList;

public class Cofrinho { // Classe Cofrinho

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>(); // Array de moedas

	public Cofrinho(ArrayList<Moeda> moedas) { // construtor da classe Cofrinho que recebe moedas do array moedas
		this.moedas = moedas;
	}

	public Cofrinho() {} // construtor vazio
	
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
		// se cofrinho vazio imprime mensagem
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

	public ArrayList<Moeda> getMoedas() { // pega a moeda
		return moedas;
	}

	public void setMoedas(ArrayList<Moeda> moedas) { // define a moeda
		this.moedas = moedas;
		
	}

}

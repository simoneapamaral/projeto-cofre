package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		int opcaoDois;
		double valorLido;
		
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		ArrayList<Moeda> moedas = new ArrayList<Moeda>();
		

		do {
			
			menuUm();

			opcao = teclado.nextInt();
			System.out.printf("\n");

			// Primeira Opção do menu
			if (opcao == 1) {

				menuDois();

				opcaoDois = teclado.nextInt();
				
				if (opcaoDois == 1) {
					Dolar dolar = new Dolar();
					
					System.out.println("Digite valor em Dolar:");
					valorLido =  teclado.nextInt();
					
					dolar.setValor(dolar.converter(valorLido));
					moedas.add(dolar);
					cofrinho.adicionar(moedas);
					
					
				}
				else if (opcaoDois == 2) {
					Euro euro = new Euro();
					
					System.out.println("Digite valor em Euro:");
					valorLido =  teclado.nextInt();
					
					euro.setValor(euro.converter(valorLido));
					moedas.add(euro);
					cofrinho.adicionar(moedas);
					}
				else if (opcaoDois == 3) {
					Real real = new Real();
					
					System.out.println("Digite valor em Real:");
					valorLido =  teclado.nextInt();
					
					real.setValor(real.converter(valorLido));
					moedas.add(real);
					cofrinho.adicionar(moedas);

					}
				else if(opcaoDois == 0) {
					System.out.println("Retornando ao Menu Principal...");
					System.out.println();
					}
				else {
					System.out.println("Opcao invalida!");
					System.out.println();
					}
			}
			
			else if (opcao == 2) { // Remover Moeda
				System.out.println("°°°°°°°°°°°°° Remover Moedas °°°°°°°°°°°°°");
				System.out.println();
				

			}
			
			else if (opcao == 3) { //Listar todas as moedas
				System.out.println("°°°°°°°°°°°°° Listar Moedas °°°°°°°°°°°°°");
				System.out.println();
				cofrinho.imprimirMoedas();
				System.out.println();
			}
			
			else if (opcao == 4) { // Calcular quanto dinheiro existe no cofrinho convertido para Real
				System.out.println("°°°°°°°°°°°°° Total no Cofrinho °°°°°°°°°°°°°");
				System.out.println();
				System.out.println("Valor total no cofrinho convertido em Real: " + cofrinho.totalConvertido());
				System.out.println();
			}

			else if (opcao == 0) {
				System.out.println("Programa encerrado.");
			}
			
			else {
				System.out.println();
				System.out.println("Opcao invalida!");
			}

		} while (opcao != 0);
		
	
	}

	private static void menuUm() {
		System.out.println("******************************* MENU *******************************");
		System.out.println("1 - Adicionar moedas de diferentes valores e paises em seu cofrinho");
		System.out.println("2 - Remover moedas especificas do cofrinho");
		System.out.println("3 - Listar todas as moedas que estao dentro do cofrinho");
		System.out.println("4 - Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("0 - Sair");
		System.out.println("********************************************************************");
		System.out.println();
	}

	private static void menuDois() {
		System.out.println("°°°°°°°°°°°°° Adicionar Moedas °°°°°°°°°°°°°");
		System.out.println("Escolha qual o tipo de moeda que ira adicionar ao cofrinho");
		System.out.println("1 - Dolar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println("0 - Retornar ao Menu Inicial");
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		System.out.println();
	}

}

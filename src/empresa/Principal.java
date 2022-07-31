package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcao;
		int opcaoDois;
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		ArrayList<Moeda> moedas = new ArrayList<Moeda>();

		do {

			menu1();

			opcao = teclado.nextInt();
			System.out.printf("\n");

			if (opcao == 1) {

				menuDois();

				opcaoDois = teclado.nextInt();
				if (opcaoDois == 1) {
					Dolar dolar = new Dolar();
					dolar.setValor(dolar.converter(5));
					moedas.add(dolar);
					cofrinho.adicionar(moedas);
				}

			}

			if (opcao == 9) {
				System.out.println("Obrigado!!!");
			}

		} while (opcao != 9);

	}

	private static void menu1() {
		System.out.println("******************************* MENU *******************************");
		System.out.println("1 - Adicionar moedas de diferentes valores e paises em seu cofrinho");
		System.out.println("2 - Remover moedas especificas do cofrinho");
		System.out.println("3 - Listar todas as moedas que estao dentro do cofrinho");
		System.out.println("4 - Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("9 - Sair");
		System.out.println("********************************************************************");
		System.out.println();
	}

	private static void menuDois() {
		System.out.println("******************************* MENU *******************************");
		System.out.println("Escolha qual o tipo de moeda que irá ser armazenado:");
		System.out.println("1 - Dolar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println("********************************************************************");
		System.out.println();
	}

}

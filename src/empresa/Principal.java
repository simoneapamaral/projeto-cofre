package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal { // Classe Principal

	public static void main(String[] args) {

		int opcao;
		int opcaoDois;
		double valorLido;
		int moedaLido;

		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		ArrayList<Moeda> moedas = new ArrayList<Moeda>();

		do {

			menuUm();

			opcao = teclado.nextInt();
			System.out.printf("\n");

			// Opção 1 - Adicionar moedas de diferentes valores e paises
			if (opcao == 1) {

				menuDois();
				opcaoDois = teclado.nextInt();

				if (opcaoDois == 1) {
					Dolar dolar = new Dolar();
					System.out.println("\nDigite valor em Dolar:");
					valorLido = teclado.nextDouble();
					// enquanto valor for menor ou igual a zero será solicitado um valor maior que zero
					while (valorLido <= 0) {
						System.out.println("\nValor invalido!\nDigite um valor maior que zero.\n");
						System.out.println("\nDigite valor em Dolar:");
						valorLido = teclado.nextDouble();
						
					}
					dolar.setValor(valorLido);
					moedas.add(dolar);
					// Trazendo o método info da classe moeda através do super declarado na classe Dolar
					dolar.infoMoeda();
					cofrinho.adicionar(moedas);
					dolar.info();

				} else if (opcaoDois == 2) {
					Euro euro = new Euro();
					System.out.println("\nDigite valor em Euro:");
					valorLido = teclado.nextDouble();
					// enquanto valor for menor ou igual a zero será solicitado um valor maior que zero
					while (valorLido <= 0) {
						System.out.println("\nValor invalido!\nDigite um valor maior que zero.\n");
						System.out.println("\nDigite valor em Euro:");
						valorLido = teclado.nextDouble();
						
					}
					euro.setValor(valorLido);
					moedas.add(euro);
					// Trazendo o método info da classe moeda através do super declarado na classe Euro
					euro.infoMoeda();
					cofrinho.adicionar(moedas);
					euro.info();
 
				} else if (opcaoDois == 3) {
					Real real = new Real();
					System.out.println("\nDigite valor em Real:");
					valorLido = teclado.nextDouble();
					// enquanto valor for menor ou igual a zero será solicitado um valor maior que zero
					while (valorLido <= 0) {
						System.out.println("\nValor invalido!\nDigite um valor maior que zero.\n");
						System.out.println("\nDigite valor em Real:");
						valorLido = teclado.nextDouble();
						
					}
					real.setValor(valorLido);
					moedas.add(real);
					// Trazendo o método info da classe moeda através do super declarado na classe Real
					real.infoMoeda();
					cofrinho.adicionar(moedas);
					real.info();

				} else if (opcaoDois == 0) {
					System.out.println("Retornando ao Menu Principal...");
					System.out.println();

				} else {
					System.out.println("Opcao invalida!");
					System.out.println();
				}
			}

			// Opção 2 - Remover moedas específicas
			else if (opcao == 2) {
				if(moedas.size() == 0) {
					System.out.println("Ooops!\nCofrinho vazio :(\n");
				}
				else {
				System.out.println("°°°°°°°°°°°°° Remover Moedas °°°°°°°°°°°°°");
				
				try {
					System.out.println("Digite o indice da moeda que deseja remover: ");

					System.out.println();

					for (int i = 0; i < moedas.size(); i++) {
						System.out.println("Indice: " + i + " -> " + moedas.get(i));
					}
					moedaLido = teclado.nextInt();
					cofrinho.remover(moedaLido);
					System.out.println();
					// verifica se o indice informado é menor ou maior que o array de moedas
				    if(moedaLido < 0 || moedaLido > moedas.size()) {
				    	System.out.println("Indice invalido");
						}
				        // tratando exceção caso usuário informe índice inválido
				    }         catch (Exception e) {
				        System.out.println("\nOcorreu um problema: " + e.getMessage());
					
				}
				finally {
					System.out.println("\nOperacao finalizada!\nRetornando ao Menu Inicial...\n");
					}
				}
				
			}
		

			// Opção 3 - Listar todas as moedas
			else if (opcao == 3) {
				System.out.println("°°°°°°°°°°°°° Listar Moedas °°°°°°°°°°°°°");
				System.out.println();
				cofrinho.listagemMoedas();
				System.out.println();
			}

			// Opção 4 - Calcular quanto dinheiro existe no cofrinho convertido para Real
			else if (opcao == 4) {
				System.out.println("°°°°°°°°°°°°° Total no Cofrinho °°°°°°°°°°°°°");
				System.out.println();
				System.out.println("Valor total no cofrinho convertido em Reais: " + cofrinho.totalConvertido());
				System.out.println();
			}

			// Encerrar programa
			else if (opcao == 0) {
				System.out.println("Programa encerrado.");
			}

			else {
				System.out.println();
				System.out.println("Opcao invalida!\n");
			}

			// laço de repetição do menu inicial
		} while (opcao != 0);

	}

	// menu incial
	private static void menuUm() {
		System.out.println("*************************** MENU INICIAL ***************************");
		System.out.println("1 - Adicionar moedas de diferentes valores e paises em seu cofrinho");
		System.out.println("2 - Remover moedas especificas do cofrinho");
		System.out.println("3 - Listar todas as moedas que estao dentro do cofrinho");
		System.out.println("4 - Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("0 - Sair");
		System.out.println("********************************************************************");
		System.out.println();
	}

	// menu para adicionar diferentes moedas
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

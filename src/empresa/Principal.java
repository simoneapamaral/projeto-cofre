package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("******************************* MENU *******************************");
		System.out.println("1 - Adicionar moedas de diferentes valores e paises em seu cofrinho");
		System.out.println("2 - Remover moedas especificas do cofrinho");
		System.out.println("3 - Listar todas as moedas que estao dentro do cofrinho");
		System.out.println("4 - Calcular quanto dinheiro existe no cofrinho convertido para Real");
		System.out.println("********************************************************************");
		System.out.println();
		System.out.println("Informe o que deseja fazer: ");
		opcao = teclado.nextInt();
		
		if(opcao == 1) {
			System.out.println("°°°°°°°° Adicionar moedas °°°°°°°°");
		}
		else if(opcao == 2) {
			System.out.println("°°°°°°°° Remover moedas °°°°°°°°");
		}
		else if(opcao == 3) {
			System.out.println("°°°°°°°° Listar todas as moedas °°°°°°°°");
		}
		else if(opcao == 4) {
			System.out.println("°°°°°°°° Total no cofrinho °°°°°°°°");
		}
		else {
			System.out.println("Opcao invalida!");
		}
		

	}

}

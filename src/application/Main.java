package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int opcao = -1; // atribuição provisória a variável para forçar e entrada no looping

		// looping de interação com o usuário
		while (opcao != 0) {

			System.out.println("====================================");
			System.out.println("SISTEMA DE GERENCIAMENTO DE PRODUTOS");
			System.out.println("====================================");
			System.out.println();
			System.out.println("1. Cadastrar produto:");
			System.out.println("2. Listar produtos:");
			System.out.println("3. Buscar produto por código:");
			System.out.println("4. Editar produto:");
			System.out.println("5. Remover produto:");
			System.out.println("6. Filtrar produtos:");
			System.out.println("0. Sair:");

			System.out.print("\nDigite a opção: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Produto: (em construção)");
				break;
			case 2:
				System.out.println("Listar produtos: (em construção)");
				break;
			case 3:
				System.out.println("Buscar produtos por código: (em construção)");
				break;
			case 4:
				System.out.println("Editar produto: (em construção)");
				break;
			case 5:
				System.out.println("Remover produto: (em construção)");
				break;
			case 6:
				System.out.println("Filtrar produtos: (em construção)");
				break;
			case 0:
				System.out.println("Saindo do programa... (em construção)");
				break;
			default:
				System.out.println("Opção inválida! Digite novamente: (em construção)");
				break;

			}

		}

		sc.close();

	}

}

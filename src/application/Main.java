package application;

import java.util.Locale;
import java.util.Scanner;

import services.GerenciamentoLoja;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();
		GerenciamentoLoja gerenciamento = new GerenciamentoLoja();

		int opcao = -1; // atribuição provisória à variável opção para forçar e entrada no looping
		int proximoId = 1;

		// looping de interação com o usuário
		while (opcao != 0) {
			
			// exibição do menu
			menu.exibirMenuPrincipal();
			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {

			case 1:
				
				gerenciamento.cadastrarProdutos(sc);

				break;

			case 2:

				gerenciamento.listarProdutos(sc);

				break;

			case 3:

				gerenciamento.removerProdutos(sc);
				
				break;

			case 4:

				gerenciamento.editarProdutos(sc);

				break;

			case 5:

				gerenciamento.filtrarProdutos(sc);

				break;

			case 6:

				gerenciamento.exibirRelatorioDoCarrinho(sc);

				break;

			case 0:
				
				System.out.println("Saindo do programa...");

				break;

			default:
				
				System.out.println("Opção inválida!");
				
				break;

			}

		}

		sc.close();

	}

}

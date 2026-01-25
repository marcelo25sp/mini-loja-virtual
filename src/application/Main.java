package application;

import java.util.Locale;
import java.util.Scanner;

import entities.enums.Categoria;
import services.GerenciamentoLoja;
import utils.InputUtils;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();
		GerenciamentoLoja gerenciamento = new GerenciamentoLoja();

		boolean executando = true; // atribuição para a entrada no looping do menu principal

		// looping de interação com o usuário
		while (executando) {

			// exibição do menu
			menu.exibirMenuPrincipal();
			int opcao = InputUtils.lerInt(sc, "Entre com a opção: ");
			System.out.println();

			switch (opcao) {

			case 1:

				gerenciamento.cadastrarProdutos(sc);
				InputUtils.pausar(sc);

				break;

			case 2:

				gerenciamento.listarProdutos(sc);
				InputUtils.pausar(sc);

				break;

			case 3:

				gerenciamento.removerProdutos(sc);
				InputUtils.pausar(sc);

				break;

			case 4:

				gerenciamento.editarProdutos(sc);
				InputUtils.pausar(sc);

				break;

			case 5:

				gerenciamento.filtrarProdutos(sc);
				InputUtils.pausar(sc);

				break;

			case 6:

				gerenciamento.exibirRelatorioDoCarrinho(sc);
				InputUtils.pausar(sc);

				break;

			case 0:

				System.out.println("Saindo do programa...");
				executando = false;

				break;

			default:

				System.out.println("Opção inválida!");
				InputUtils.pausar(sc);

				break;

			}

		}

		sc.close();

	}
	
}

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.enums.Categoria;
import services.GerenciamentoLoja;

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
			int opcao = lerOpcao(sc);
			System.out.println();

			switch (opcao) {

			case 1:

				gerenciamento.cadastrarProdutos(sc);
				pausar(sc);

				break;

			case 2:

				gerenciamento.listarProdutos(sc);
				pausar(sc);

				break;

			case 3:

				gerenciamento.removerProdutos(sc);
				pausar(sc);

				break;

			case 4:

				gerenciamento.editarProdutos(sc);
				pausar(sc);

				break;

			case 5:

				gerenciamento.filtrarProdutos(sc);
				pausar(sc);

				break;

			case 6:

				gerenciamento.exibirRelatorioDoCarrinho(sc);
				pausar(sc);

				break;

			case 0:

				System.out.println("Saindo do programa...");
				executando = false;

				break;

			default:

				System.out.println("Opção inválida!");
				pausar(sc);

				break;

			}

		}

		sc.close();

	}

	public static int lerOpcao(Scanner sc) {
		while (true) {
			try {
				System.out.print("Entre com a opção desejada: ");
				int opcao = Integer.parseInt(sc.nextLine());
				return opcao;
			} catch (NumberFormatException e) {
				System.out.println("Entrada Inválida. Digite apenas números.");
			}
		}
	}

	public static void pausar(Scanner sc) {
		System.out.println("\nPressione ENTER para continuar...");
		sc.nextLine();
	}

	public static Categoria lerCategoria(Scanner sc) {
		while (true) {
			try {
				System.out.print("Categoria (ELETRONICO/ROUPA/LIVRO/SERVICO/SOFTWARE): ");
				return Categoria.valueOf(sc.nextLine().toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Categoria inválida! Tente novamente.");
			}
		}
	}

}

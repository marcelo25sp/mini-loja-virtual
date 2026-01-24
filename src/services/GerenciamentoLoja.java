package services;

import java.util.Scanner;

import dto.ProdutoDTO;
import entities.Carrinho;
import entities.Produto;
import entities.ProdutoAssinatura;
import entities.ProdutoDigital;
import entities.ProdutoFisico;
import entities.enums.Categoria;
import utils.InputUtils;

public class GerenciamentoLoja {

	Carrinho carrinho = new Carrinho();

	public void cadastrarProdutos(Scanner sc) {

		System.out.println("Cadastrar Produto:");
		System.out.println("1. Físico | 2. Digital | 3. Assinatura");

		int tipo = InputUtils.lerInt(sc, "Escolha o tipo: ");

		ProdutoDTO dto = InputUtils.lerProdutoDTO(sc);

		Produto produto = criarProdutoPeloDTO(tipo, dto, sc);

		carrinho.adicionarProduto(produto);

		System.out.println("Produto cadastrado com sucesso!");
		System.out.println("-------------------------------");
		System.out.println();

	}

	public void listarProdutos(Scanner sc) {

		System.out.println("Lista de produtos:");
		carrinho.listarProdutos();
		System.out.printf("Preço final: R$ %.2f\n", carrinho.calculoTotal());
		System.out.println("-------------------------------");

	}

	public void removerProdutos(Scanner sc) {

		System.out.print("Informe o ID do produto a ser removido: ");
		int id = sc.nextInt();

		boolean removido = carrinho.removerProdutoPorId(id);

		if (removido) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Produto não encontrado!");
		}
		System.out.println("-------------------------------");

	}

	public void editarProdutos(Scanner sc) {

		System.out.print("Informe o ID do produto: ");
		int idEditar = sc.nextInt();
		sc.nextLine();

		Produto produto = carrinho.buscarProdutoPorId(idEditar);

		if (produto == null) {
			System.out.println("Produto não encontrado!");
			return;
		}

		System.out.print("Novo nome: ");
		String novoNome = sc.nextLine();

		System.out.print("Novo preço: ");
		double novoPreco = sc.nextDouble();

		System.out.print("Nova quantidade: ");
		int novaQuantidade = sc.nextInt();
		sc.nextLine();

		System.out.print("Categoria: (ELETRONICO/SERVICO/ROUPA/SERVICO/SOFTWARE) ");
		Categoria novaCategoria = Categoria.valueOf(sc.next().toUpperCase());

		boolean editado = carrinho.editarProduto(idEditar, novoNome, novoPreco, novaQuantidade, novaCategoria);

		if (editado) {
			System.out.println("Produto atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado!");
		}
		System.out.println("-------------------------------");

	}

	public void filtrarProdutos(Scanner sc) {

		System.out.println("Selecione a categoria:");
		System.out.println("(ELETRONICO | ROUPA | SERVICO | LIVRO | SOFTWARE)");
		System.out.print("Digite a categoria: ");

		Categoria categoria = Categoria.valueOf(sc.next().toUpperCase());
		carrinho.filtrarPorCategoria(categoria);

		System.out.println("\nPressione ENTER para continuar...");
		sc.nextLine(); // limpa o buffer
		sc.nextLine(); // espera o click ENTER

		System.out.println("-------------------------------");

	}

	public void exibirRelatorioDoCarrinho(Scanner sc) {

		carrinho.exibirResumo();
		System.out.println("\nPressione ENTER para continuar...");
		sc.nextLine();
		sc.nextLine();

		System.out.println("-------------------------------");

	}

	private Produto criarProdutoPeloDTO(int tipo, ProdutoDTO dto, Scanner sc) {

		if (tipo == 1) {
			double peso = InputUtils.lerDouble(sc, "Peso (g): ");
			double custoFrete = InputUtils.lerDouble(sc, "Custo do frete: ");

			return new ProdutoFisico(dto.getNome(), dto.getPreco(), dto.getQuantidade(), dto.getCategoria(), peso,
					custoFrete);

		} else if (tipo == 2) {
			double tamanhoArquivo = InputUtils.lerDouble(sc, "Tamanho do arquivo (MB): ");
			double taxaDigital = InputUtils.lerDouble(sc, "Taxa digital: ");

			return new ProdutoDigital(dto.getNome(), dto.getPreco(), dto.getQuantidade(), dto.getCategoria(),
					tamanhoArquivo, taxaDigital);

		} else {

			int meses = InputUtils.lerInt(sc, "Meses: ");
			double desconto = InputUtils.lerDouble(sc, "Desconto por mês: ");

			return new ProdutoAssinatura(dto.getNome(), dto.getPreco(), dto.getQuantidade(), dto.getCategoria(), meses,
					desconto);

		}

	}
}

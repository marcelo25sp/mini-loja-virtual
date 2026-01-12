package services;

import java.util.Scanner;

import entities.Carrinho;
import entities.Produto;
import entities.ProdutoAssinatura;
import entities.ProdutoDigital;
import entities.ProdutoFisico;
import entities.enums.Categoria;

public class GerenciamentoLoja {

	Carrinho carrinho = new Carrinho();

	public void cadastrarProdutos(Scanner sc) {

		System.out.println("Cadastrar Produto: (1. Físico/ 2. Digital/ 3. Assinatura) ");
		System.out.print("Escolha o tipo de produto: ");
		int tipo = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: (R$) ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade: (unidades) ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		System.out.print("Categoria: (ELETRONICO/ROUPA/LIVRO/SOFTWARE/SERVICO) ");
		Categoria categoria = Categoria.valueOf(sc.next().toUpperCase());

		if (tipo == 1) {
			System.out.print("Peso: (g) ");
			double peso = sc.nextDouble();
			System.out.print("Custo do frete: (R$) ");
			double custoFrete = sc.nextDouble();
			ProdutoFisico produto = new ProdutoFisico(nome, preco, quantidade, categoria, peso, custoFrete);
			carrinho.adicionarProduto(produto);
		} else if (tipo == 2) {
			System.out.print("Tamanho do arquivo (MB): ");
			double tamanhoArquivo = sc.nextDouble();
			System.out.print("Taxa digital: (R$) ");
			double taxaDigital = sc.nextDouble();
			ProdutoDigital produto = new ProdutoDigital(nome, preco, quantidade, categoria, tamanhoArquivo,
					taxaDigital);
			carrinho.adicionarProduto(produto);
		} else {
			System.out.print("Meses: ");
			int meses = sc.nextInt();
			System.out.print("Desconto por mês: (R$) ");
			double descontoPorMes = sc.nextDouble();
			ProdutoAssinatura produto = new ProdutoAssinatura(nome, preco, quantidade, categoria, meses,
					descontoPorMes);
			carrinho.adicionarProduto(produto);
		}

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
	
	

}

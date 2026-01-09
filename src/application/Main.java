package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carrinho;
import entities.Produto;
import entities.ProdutoAssinatura;
import entities.ProdutoDigital;
import entities.ProdutoFisico;
import entities.enums.Categoria;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Carrinho carrinho = new Carrinho();

		int opcao = -1; // atribuição provisória à variável opção para forçar e entrada no looping

		// looping de interação com o usuário
		while (opcao != 0) {

			System.out.println("====================================");
			System.out.println("=========MINI LOJA VIRTUAL==========");
			System.out.println("====================================");
			System.out.println();
			System.out.println("1. Cadastrar produto:");
			System.out.println("2. Listar produtos:");
			System.out.println("3. Remover produto:");
			System.out.println("4. Editar produto:");
			System.out.println("5. Filtrar produtos:");
			System.out.println("0. Sair:");

			System.out.print("\nEntre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:

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
					ProdutoFisico produto = new ProdutoFisico(quantidade, nome, preco, quantidade, categoria, peso,
							custoFrete);
					carrinho.adicionarProduto(produto);
				} else if (tipo == 2) {
					System.out.print("Tamanho do arquivo (MB): ");
					double tamanhoArquivo = sc.nextDouble();
					System.out.print("Taxa digital: (R$) ");
					double taxaDigital = sc.nextDouble();
					ProdutoDigital produto = new ProdutoDigital(quantidade, nome, preco, quantidade, categoria,
							tamanhoArquivo, taxaDigital);
					carrinho.adicionarProduto(produto);
				} else {
					System.out.print("Meses: ");
					int meses = sc.nextInt();
					System.out.print("Desconto por mês: (R$) ");
					double descontoPorMes = sc.nextDouble();
					ProdutoAssinatura produto = new ProdutoAssinatura(quantidade, nome, preco, quantidade, categoria,
							meses, descontoPorMes);
					carrinho.adicionarProduto(produto);
				}

				System.out.println("Produto cadastrado com sucesso!");
				System.out.println("-------------------------------");
				System.out.println();

				break;

			case 2:
				
				System.out.println("Lista de produtos:");
				carrinho.listarProdutos();
				System.out.printf("Preço final: R$ %.2f\n", carrinho.calculoTotal());
				
				break;
				
			case 3:
				
				System.out.print("Informe o ID do produto a ser removido: ");
				int id = sc.nextInt();
				
				boolean removido = carrinho.removerProdutoPorId(id);
				
				if(removido) {
					System.out.println("Produto removido com sucesso!");
				}else {
					System.out.println("Produto não encontrado!");
				}				
				break;
				
			case 4:
				
				System.out.print("Informe o ID do produto: ");
				int idEditar = sc.nextInt();
				sc.nextLine();
				
				Produto produto = carrinho.buscarProdutoPorId(idEditar);
				
				if(produto == null) {
					System.out.println("Produto não encontrado!");
					break;
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
				
				if(editado) {
					System.out.println("Produto atualizado com sucesso!");
				}else {
					System.out.println("Produto não encontrado!");
				}
				
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

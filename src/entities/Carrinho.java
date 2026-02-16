package entities;

import java.util.HashMap;
import java.util.Map;

import entities.enums.Categoria;
import entities.exceptions.ProdutoNaoEncontradoException;

public class Carrinho {

	public Carrinho() {
	}

	private Map<Integer, Produto> itens = new HashMap<>();
	private int proximoId = 1;

	public void adicionarProduto(Produto produto) {
		produto.setId(proximoId);
		itens.put(proximoId, produto);
		proximoId++;

	}

	public void listarProdutos() {
		if (itens.isEmpty()) {
			System.out.println("Nenhum produto cadastrado!");
			return;
		}

		for (Produto p : itens.values()) {
			System.out.println(p);
		}
	}

	public double calculoTotal() {
		double total = 0.0;
		for (Produto p : itens.values()) {
			total += p.calcularPrecoFinal();
		}
		return total;
	}

	public Produto buscarProdutoPorId(int id) {

		for (Produto p : itens.values()) {
			if (p.getId() == id) {
				return p;
			}
		}

		throw new ProdutoNaoEncontradoException("Produto não encontrado.");
	}

	public boolean editarProduto(int id, String nome, double preco, int quantidade, Categoria categoria) {
		Produto produto = buscarProdutoPorId(id);

		if (produto != null) {
			produto.setNome(nome);
			produto.setPreco(preco);
			produto.setQuantidade(quantidade);
			produto.setCategoria(categoria);
			return true;
		}

		return false;
	}

	public void filtrarPorCategoria(Categoria categoria) {
		boolean encontrado = false;

		for (Produto p : itens.values()) {
			if (p.getCategoria() == categoria) {
				System.out.println(p);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Nenhum produto encontrado com a categoria solicitada!");
		}
	}
	
	public void removerProdutoPorId(int id){
		
		Produto produto = itens.remove(id);
		
		if(produto == null) {
			throw new ProdutoNaoEncontradoException("Produto não encontrado.");
		}
		
	}
	public void exibirResumo() {
		if (itens.isEmpty()) {
			System.out.println("Carrinho vazio");
			return;
		}

		double total = 0.0;
		int totalItens = 0;

		System.out.println("===== RESUMO DO CARRINHO =====");

		for (Produto p : itens.values()) {
			double precoFinal = p.calcularPrecoFinal();

			System.out.printf("Produto: %s | Quantidade: %d | Preço final: R$ %.2f%n", p.getNome(), p.getQuantidade(),
					precoFinal);
			total += precoFinal;
			totalItens += p.getQuantidade();
		}

		System.out.println("--------------------------------------");
		System.out.printf("Total de Itens: %d unidades\n", totalItens);
		System.out.printf("Valor total a pagar: R$ %.2f%n", total);
	}

}

package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Categoria;

public class Carrinho {
	
	public Carrinho() {		
	}

	private List<Produto> itens = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		itens.add(produto);
	}

	public void listarProdutos() {
		for (Produto p : itens) {
			System.out.println(p); // mensagem provisória (em construção) 
		}
	}

	public double calculoTotal() {
		double total = 0.0;
		for (Produto p : itens) {
			total += p.calcularPrecoFinal();
		}
		return total;
	}
	
	public Produto buscarProdutoPorId(int id) {
		for(Produto p : itens) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	public boolean removerProdutoPorId(int id) {
		Produto produto = buscarProdutoPorId(id);
		
		if(produto != null) {
			itens.remove(produto);
			return true;
		}
		
		return false;				
				
	}
	
	public boolean editarProduto(int id, String nome, double preco, int quantidade, Categoria categoria) {
		Produto produto = buscarProdutoPorId(id);
		
		if(produto != null) {
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
		
		for(Produto p : itens) {
			if(p.getCategoria() == categoria) {
				System.out.println(p);
				encontrado = true;
			}
		}
		
		if(!encontrado) {
			System.out.println("Nenhum produto encontrado com a categoria solicitada!");
		}
	}
	
	public void exibirResumo() {
		if(itens.isEmpty()) {
			System.out.println("Carrinho vazio");
			return;
		}
		
		double total = 0.0;
		int totalItens = 0;
		
		System.out.println("===== RESUMO DO CARRINHO =====");
		
		for(Produto p : itens) {
			System.out.println(p);
			total += p.getPreco() * p.getQuantidade();
			totalItens += p.getQuantidade();
		}
		
		System.out.println("--------------------------------------");
		System.out.printf("Total de Itens: %d unidades\n", totalItens);
		System.out.printf("Valor total a pagar: R$ %.2f%n", total);
	}

}

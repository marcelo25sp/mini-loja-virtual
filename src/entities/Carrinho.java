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
	
	public boolean editarProdutoPorId(int id, String nome, double preco, int quantidade, Categoria categoria) {
		Produto produto = buscarProdutoPorId(id);
		
		if(produto != null) {
			produto.setNome(nome);
			produto.setPreco(id);
			produto.setPreco(preco);
			produto.setQuantidade(quantidade);
			produto.setCategoria(categoria);
			return true;
		}
		
		return false;		
	}

}

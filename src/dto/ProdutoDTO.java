package dto;

import entities.enums.Categoria;

public class ProdutoDTO {

	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;

	public ProdutoDTO(String nome, double preco, int quantidade, Categoria categoria) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}

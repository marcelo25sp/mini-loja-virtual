package entities;

import entities.enums.Categoria;

public abstract class Produto {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;

	public Produto(int id, String nome, double preco, int quantidade, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public abstract double calcularPrecoFinal(); // método em construção

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ ", categoria=" + categoria + "]";
	}

}

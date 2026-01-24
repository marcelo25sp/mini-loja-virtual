package entities;

import entities.enums.Categoria;

public abstract class Produto {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;
	


	public Produto(String nome, double preco, int quantidade, Categoria categoria) {
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

	public abstract double calcularPrecoFinal(); // polimorfismo

	@Override
	public String toString() {
		return String.format("Código: %d | Produto: %s | Categoria: %s | Quantidade: %d | Preço unitário: R$ %.2f%n ", id, nome, categoria, quantidade, preco);
	}

}

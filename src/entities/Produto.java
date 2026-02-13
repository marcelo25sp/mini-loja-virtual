package entities;

import entities.enums.Categoria;
import entities.exceptions.RegraNegocioException;

public abstract class Produto {

	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;
	


	public Produto(String nome, double preco, int quantidade, Categoria categoria) {
		
		if(nome == null || nome.trim().isEmpty()) {
			throw new RegraNegocioException("Nome do produto não pode ser vazio!");
		}
		
		if(preco <= 0) {
			throw new RegraNegocioException("O preço não pode ser menor ou igual a R$ 0.00!");
		}
		
		if(quantidade < 0) {
			throw new RegraNegocioException("A quantidade não pode ser menor que zero!");
		}
		
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

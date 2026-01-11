package entities;

import entities.enums.Categoria;

public class ProdutoFisico extends Produto {

	private double peso;
	private double custoFrete;

	public ProdutoFisico(String nome, double preco, int quantidade, Categoria categoria, double peso,
			double custoFrete) {
		super(nome, preco, quantidade, categoria);
		this.peso = peso;
		this.custoFrete = custoFrete;
	}

	public double getPeso() {
		return peso;
	}

	public double getCustoFrete() {
		return custoFrete;
	}

	@Override
	public double calcularPrecoFinal() {
		return (getPreco() * getQuantidade()) + custoFrete;

	}

}

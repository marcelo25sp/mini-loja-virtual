package entities;

import entities.enums.Categoria;

public class ProdutoDigital extends Produto {

	private double tamanhoArquivo;
	private double taxaDigital;

	public ProdutoDigital(int id, String nome, double preco, int quantidade, Categoria categoria, double tamanhoArquivo,
			double taxaDigital) {
		super(id, nome, preco, quantidade, categoria);
		this.tamanhoArquivo = tamanhoArquivo;
		this.taxaDigital = taxaDigital;
	}

	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public double getTaxaDigital() {
		return taxaDigital;
	}

	@Override
	public double calcularPrecoFinal() {
		return (getPreco() * getQuantidade()) + taxaDigital;
	}

}

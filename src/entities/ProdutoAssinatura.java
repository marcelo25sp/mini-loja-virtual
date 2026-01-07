package entities;

import entities.enums.Categoria;

public class ProdutoAssinatura extends Produto {

	private int meses;
	private double descontoPorMes;

	public ProdutoAssinatura(int id, String nome, double preco, int quantidade, Categoria categoria, int meses,
			double descontoPorMes) {
		super(id, nome, preco, quantidade, categoria);
		this.meses = meses;
		this.descontoPorMes = descontoPorMes;
	}

	public int getMeses() {
		return meses;
	}

	public double getDescontoPorMes() {
		return descontoPorMes;
	}

	@Override
	public double calcularPrecoFinal() {
		double precoMensal = getPreco() - descontoPorMes;
		return precoMensal * meses * getQuantidade();
	}

}

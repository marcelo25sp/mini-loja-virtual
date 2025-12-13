package entities;

public class ProdutoFisico extends Produto {
	
	private double peso;
	private double custoFrete;

	public ProdutoFisico(int id, String nome, double preco, int quantidade, String categoria, double peso, double custoFrete) {
		super(id, nome, preco, quantidade, categoria);
		this.peso = peso;
		this.custoFrete = custoFrete;
	}

	@Override
	public double calcularPrecoFinal() {
		return 0;
	}

}

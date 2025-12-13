package entities;

public class ProdutoDigital extends Produto{

	public ProdutoDigital(int id, String nome, double preco, int quantidade, String categoria) {
		super(id, nome, preco, quantidade, categoria);
	}

	@Override
	public double calcularPrecoFinal() {
		return 0;
	}

}

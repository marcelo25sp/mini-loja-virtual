package entities;

public class ProdutoAssinatura extends Produto {

	public ProdutoAssinatura(int id, String nome, double preco, int quantidade, String categoria) {
		super(id, nome, preco, quantidade, categoria);
	}

	@Override
	public double calcularPrecoFinal() {
		return 0; // em construção
	}

}

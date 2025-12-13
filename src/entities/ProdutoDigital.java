package entities;

public class ProdutoDigital extends Produto{
	
	private double tamanhoArquivo;
	private double taxaDigital;

	public ProdutoDigital(int id, String nome, double preco, int quantidade, String categoria, double tamanhoArquivo, double taxaDigital) {
		super(id, nome, preco, quantidade, categoria);
		this.tamanhoArquivo = tamanhoArquivo;
		this.taxaDigital = taxaDigital;
	}

	@Override
	public double calcularPrecoFinal() {
		return 0;
	}

}

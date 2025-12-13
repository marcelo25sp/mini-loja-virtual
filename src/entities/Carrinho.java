package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> itens = new ArrayList<>();

	public void adicionarProduto(Produto produto) {
		itens.add(produto);
	}

	public void listarProdutos() {
		for (Produto p : itens) {
			System.out.println(p);
		}
	}

	public double calculoTotal() {
		double total = 0.0;
		for (Produto p : itens) {
			total += p.calcularPrecoFinal();
		}
		return total;
	}

}

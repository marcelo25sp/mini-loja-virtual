package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> itens = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) {
		itens.add(produto);
	}

}

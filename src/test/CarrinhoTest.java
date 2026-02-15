package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.Carrinho;
import entities.Produto;
import entities.ProdutoAssinatura;
import entities.ProdutoFisico;
import entities.enums.Categoria;

public class CarrinhoTest {

	@Test
	void deveSomarValorTotalCarrinho() {

		Carrinho carrinho = new Carrinho();

		Produto p1 = new ProdutoFisico("Teclado", 100.0, 1, Categoria.ELETRONICO, 500, 10);
		Produto p2 = new ProdutoAssinatura("Curso Java", 50.0, 1, Categoria.SERVICO, 6, 10.0);

		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p2);

		double total = carrinho.calculoTotal();

		assertEquals(350.00, total);
	}

}

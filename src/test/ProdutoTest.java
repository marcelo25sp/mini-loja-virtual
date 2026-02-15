package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entities.ProdutoDigital;
import entities.ProdutoFisico;
import entities.enums.Categoria;

public class ProdutoTest {
	
	@Test
	void deveCalcularPrecoFinalProdutoFisico() {
		
		ProdutoFisico produto = new ProdutoFisico("TV", 1500.0, 2, Categoria.ELETRONICO, 300, 20.0);
		
		double total = produto.calcularPrecoFinal();
		
		// (1500.0 * 2) + 20.0 = 3020.00
		assertEquals(3020.0, total);
	}
	
	@Test
	void deveCalcularPrecoFinalProdutoDigital() {
		
		ProdutoDigital produto = new ProdutoDigital("Plano DevNet", 50.0, 1, Categoria.SERVICO, 200, 10);
		
		double total = produto.calcularPrecoFinal();
		
		// (50.0 * 1) + 10.0 = 60.0
		assertEquals(60.0, total);
	}

}

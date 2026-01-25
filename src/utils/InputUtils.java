package utils;

import java.util.Scanner;

import dto.ProdutoDTO;
import entities.enums.Categoria;

public class InputUtils {
	
	public static int lerInt(Scanner sc, String mensagem) {
		int valor;
		
		while(true) {
			System.out.print(mensagem);
			if(sc.hasNextInt()) {
				valor = sc.nextInt();
				sc.nextLine(); // limpa o buffer
				return valor;
			}else {
				System.out.println("Entrada inválida. Digite um número inteiro.");
				sc.nextLine();
			}
		}
		
	}
	
	public static double lerDouble(Scanner sc, String mensagem) {
		double valor;
		
		while(true) {
			System.out.print(mensagem);
			if(sc.hasNextDouble()) {
				valor = sc.nextDouble();
				sc.nextLine(); // limpa o buffer
				return valor;
			}else {
				System.out.println("Entrada inválida. Digite um número do tipo Double.");
				sc.nextLine();
			}
		}
		
	}
	
	public static String lerString(Scanner sc, String mensagem) {
		System.out.print(mensagem);
		return sc.nextLine();
	}
	
	public static Categoria lerCategoria(Scanner sc) {
		while(true) {
			System.out.print("Categoria (ELETRONICO/ROUPA/LIVRO/SERVICO/SOFTWARE): ");
			try {
				return Categoria.valueOf(sc.nextLine().toUpperCase());
			}catch(IllegalArgumentException e) {
				System.out.println("Categoria inválida. Tente novamente!");
			}
			
		}
		
	}
	
	public static ProdutoDTO lerProdutoDTO(Scanner sc) {
		
		String nome = lerString(sc, "Nome do Produto: ");
		double preco = lerDouble(sc, "Preço do produto: ");
		int quantidade = lerInt(sc, "Quantidade: ");
		Categoria categoria = lerCategoria(sc);
		
		return new ProdutoDTO(nome, preco, quantidade, categoria);
	}
	
	public static void pausar(Scanner sc) {
	    System.out.println("\nPressione ENTER para continuar...");
	    sc.nextLine();
	}

}

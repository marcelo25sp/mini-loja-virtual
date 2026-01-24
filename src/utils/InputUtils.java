package utils;

import java.util.Scanner;

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

}

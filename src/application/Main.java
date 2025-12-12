package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("====================================");
		System.out.println("SISTEMA DE GERENCIAMENTO DE PRODUTOS");
		System.out.println("====================================");
		System.out.println();

		System.out.println("1. Cadastrar produto:");
		System.out.println("2. Listar produtos:");
		System.out.println("3. Buscar produto por código:");
		System.out.println("4. Editar produto:");
		System.out.println("5. Remover produto:");
		System.out.println("6. Filtrar produtos:");
		System.out.println("0. Sair:");
		
		System.out.print("\nDigite a opção: ");
		int opcao = sc.nextInt();

		sc.close();

	}

}

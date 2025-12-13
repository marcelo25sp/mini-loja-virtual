package entities;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	private Carrinho carrinho;

	public Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.carrinho = carrinho;
	}

}

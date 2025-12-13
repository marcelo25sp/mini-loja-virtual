package entities;

public class Cliente {

	private int idCliente;
	private String nome;
	private String email;
	private Carrinho carrinho;

	public Cliente(int idCliente, String nome, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.carrinho = carrinho;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

}

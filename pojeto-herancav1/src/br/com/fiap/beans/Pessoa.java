package br.com.fiap.beans;

public class Pessoa{

	private String nome;
	private String email;
	private double valor;

	public Pessoa() {
		super();
		
	}

	// polimorfismo e sobrecarga de métodos - no método cheio
	
	public Pessoa(String nome, String email, double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}

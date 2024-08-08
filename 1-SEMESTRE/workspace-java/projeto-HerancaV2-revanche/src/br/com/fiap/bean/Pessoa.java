package br.com.fiap.bean;

public abstract class Pessoa {

	private String nome;
	private String email;
	private double valor;

	private Endereco endereco;

	// construtor vazio
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	// construtor cheio sem atributo de referencia
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// metodo abstrato criado nas classes 
	
	public abstract String identificar();

}

package br.com.fiap.bean;

public class Carro {

	private int codig;
	private String nome;

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(int codig, String nome) {
		super();
		this.codig = codig;
		this.nome = nome;
	}

	public int getCodig() {
		return codig;
	}

	public void setCodig(int codig) {
		this.codig = codig;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}

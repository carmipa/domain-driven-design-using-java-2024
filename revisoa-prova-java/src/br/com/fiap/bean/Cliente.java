package br.com.fiap.bean;

import java.math.BigDecimal;

public class Cliente {

	// visibilidade, tipo e atributo

	private long codigo;
	private String nome;
	private double renda;
	private Endereco endereco;

	// construtor vazio

	public Cliente() {
		super();

	}

	// construtor cheio

	public Cliente(long codigo, String nome, double renda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.renda = renda;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", renda=" + renda + ", endereco=" + endereco + "]";
	}
	
	

}

package br.com.fiap.bean;

public class Endereco {

	private String logradouro;
	private String cep;

	// método contrutor vázio

	public Endereco() {
		super();

	}

	// método construtor cheio

	public Endereco(String logradouro, String cep) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
	}

	// meódos de acesso aos atributos get e set

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}

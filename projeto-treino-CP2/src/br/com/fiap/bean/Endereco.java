package br.com.fiap.bean;

public class Endereco {

	private int numero;
	private String logradouro;
	private String bairro;
	private String cep;
	private String complemento;

	public Endereco() {
		super();

	}

	public Endereco(int numero, String logradouro, String bairro, String cep, String complemento) {
		super();
		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}

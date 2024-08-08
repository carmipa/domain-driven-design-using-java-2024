package br.com.fiap.beans;

public class Endereco {

	private int codigo;
	private String logradouro;
	private int numero;
	private String cep;

	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Endereco(int codigo, String logradouro, int numero, String cep) {
		super();
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}

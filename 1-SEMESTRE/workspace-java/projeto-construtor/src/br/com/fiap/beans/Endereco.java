package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cep;

	// metodo construtor vazio
	public Endereco() {
		super();
	}

	// metodo construtor cheio
	public Endereco(String logradouro, int numero, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
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

	@Override
	public String toString() {
		return "\nEndereco "
				+ "\nlogradouro=" + logradouro 
				+ "\nnumero=" + numero 
				+ "\ncep=" + cep ;
	}
	
	

}

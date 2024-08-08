package br.com.fiap.beans;

public class Endereco {

	private String logradouto;
	private int numero;
	private String cep;
	private String bairro;

	public String getLogradouto() {
		return logradouto;
	}

	public void setLogradouto(String logradouto) {
		this.logradouto = logradouto;
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}

package br.com.fiap.bean;

public class Endereco {

	private String logradouro;
	private long numero;
	private String bairro;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, long numero, String bairro) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + "]";
	}
	
	

}

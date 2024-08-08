package br.com.fiap.bean;

public class Endereco {

	private String logradouro;
	private String cep;
	
	// construto vazio
	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}

	// construtor cheio
	public Endereco(String logradouro, String cep) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
	}

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

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cep=" + cep + "]";
	}
	
	

}

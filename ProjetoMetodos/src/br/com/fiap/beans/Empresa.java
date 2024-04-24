package br.com.fiap.beans;

public class Empresa {
	
	// Visibilidade, tipo de dados e atributos 
	private String cnpj;
	private String razaoSocial;
	
	// Setters (entrada) e Getters (retornar)
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	

}

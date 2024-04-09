package br.com.fiap.beans;

public class Empresa {
	
	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void listaEmpresa() {
		
		System.out.println("CNPJ da empresa.........: " + cnpj);
		System.out.println("Razão Social da empresa.:" + razaoSocial);
		System.out.println("Endereço da empresa.....:" + endereco);
		System.out.println("Logradouro..............: " + endereco.getLogradouto());
		System.out.println("Número..................: " + endereco.getNumero());
		System.out.println("Bairro..................: " + endereco.getBairro());
		
	}
	
}

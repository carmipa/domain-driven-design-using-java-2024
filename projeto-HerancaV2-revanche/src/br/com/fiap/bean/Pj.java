package br.com.fiap.bean;

public class Pj extends Pessoa {

	private String cnpj;
	private String razaoSocial;

	public Pj() {
		super();
		
	}

	public Pj(String nome, String email, double valor, String cnpj, String razaoSocial) {
		super(nome, email, valor);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

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

	@Override
	public String toString() {
		return "Pj [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", getCnpj()=" + getCnpj() + ", getRazaoSocial()="
				+ getRazaoSocial() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getValor()="
				+ getValor() + ", getEndereco()=" + getEndereco() + "]";
	}

	@Override
	public String identificar() {
		
		return "Informações da Pessoa Jurídica";
	}
	
	

}

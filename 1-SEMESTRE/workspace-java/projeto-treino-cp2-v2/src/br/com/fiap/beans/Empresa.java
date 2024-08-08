package br.com.fiap.beans;

public class Empresa {

	private int codigo;
	private String cnpj;
	private String razaoSocial;

	private Endereco endereco;

	public Empresa() {
		super();
		
	}

	public Empresa(int codigo, String cnpj, String razaoSocial) {
		super();
		this.codigo = codigo;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

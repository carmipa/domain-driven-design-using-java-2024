package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, String email, double valor, String cnpj) {
		super(nome, email, valor);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return "Resultado da Pessoa Jurídica";
	}


}

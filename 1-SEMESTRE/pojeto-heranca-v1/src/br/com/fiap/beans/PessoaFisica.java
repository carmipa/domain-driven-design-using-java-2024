package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {

	private String rg;
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String email, double valor, String rg, String cpf) {
		super(nome, email, valor);
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

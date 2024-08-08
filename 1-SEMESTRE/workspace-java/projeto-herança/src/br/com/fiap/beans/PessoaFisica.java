package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;

	public PessoaFisica() {
		super();
	}

	// construtor cheio com hereança.

	public PessoaFisica(String nome, String email, double valor, String cpf, String rg) {
		super(nome, email, valor);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return "Resultado da Pessoa Física";
	}


}

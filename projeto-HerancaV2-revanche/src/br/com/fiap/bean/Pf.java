package br.com.fiap.bean;

public class Pf extends Pessoa {

	private String cpf;
	private String rg;

	public Pf() {
		super();
		// TODO Auto-generated constructor stub
	}

	// construtor vazio com herança sem a referencia
	public Pf(String nome, String email, double valor, String cpf, String rg) {
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
	public String toString() {
		return "Pf [cpf=" + cpf + ", rg=" + rg + ", getCpf()=" + getCpf() + ", getRg()=" + getRg() + ", getNome()="
				+ getNome() + ", getEmail()=" + getEmail() + ", getValor()=" + getValor() + ", getEndereco()="
				+ getEndereco() + "]";
	}

	@Override
	public String identificar() {
		
		return "Informações da Pessoa Física";
	}
	
	

}

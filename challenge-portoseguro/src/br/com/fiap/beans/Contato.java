package br.com.fiap.beans;

public class Contato {

	private int codigo;
	private String telefone;
	private String celular;
	private String email;
	private String responsavel;
	private String observacao;

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contato(int codigo, String telefone, String celular, String email, String responsavel, String observacao) {
		super();
		this.codigo = codigo;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.responsavel = responsavel;
		this.observacao = observacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}

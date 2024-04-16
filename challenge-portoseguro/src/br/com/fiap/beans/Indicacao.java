package br.com.fiap.beans;

public class Indicacao {

	private int codigo;
	private String nomeOficina;
	private Endereco endereco;
	private Contato contato;

	public Indicacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Indicacao(int codigo, String nomeOficina) {
		super();
		this.codigo = codigo;
		this.nomeOficina = nomeOficina;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeOficina() {
		return nomeOficina;
	}

	public void setNomeOficina(String nomeOficina) {
		this.nomeOficina = nomeOficina;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}

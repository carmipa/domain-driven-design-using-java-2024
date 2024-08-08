package br.com.fiap.beans;

public class Cliente {

	private int codigo;
	private String nome;
	private String dataCompra;
	private double valorCompra;

	private Endereco endereco;

	public Cliente() {
		super();

	}

	public Cliente(int codigo, String nome, String dataCompra, double valorCompra) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataCompra = dataCompra;
		this.valorCompra = valorCompra;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo 
				+ ", nome=" + nome 
				+ ", dataCompra=" + dataCompra + ", valorCompra="
				+ valorCompra + ", endereco=" + endereco + "]";
	}

	
}

package br.com.fiap.beans;

public class Colaborador {

	private int codigo;
	private String nome;
	private String cargo;
	private double valorHora;
	private double quantidadeHoras;

	// atributo de referência
	private Endereco endereco;

	// metodo construtor vazio
	public Colaborador() {
		super();

	}

	// metodo construtor cheio
	public Colaborador(int codigo, String nome, String cargo, double valorHora, double quantidadeHoras) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;

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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Colaborador "
				+ "\ncodigo=" + codigo 
				+ "\nnome=" + nome 
				+ "\ncargo=" + cargo 
				+ "\nvalorHora=" + valorHora
				+ "\nquantidadeHoras=" + quantidadeHoras 
				+ "\nendereco=" + endereco;
	}


	
	
	
	
	
	

}

package br.com.fiap.beans;

public class Colaborador {

	private int codigo;
	private String nome;
	private String cargo;
	private double quantidadeHoras;
	private double valorHoras;
	private Endereco endereco;
	

	// metodo construto vazio
	public Colaborador() {
		super();

	}

	// metodo construtor cheio
	public Colaborador(int codigo, String nome, String cargo, double quantidadeHoras, double valorHoras) {
		super();
		this.codigo = codigo;
		this.nome = nome.toUpperCase();
		this.cargo = cargo;
		this.quantidadeHoras = quantidadeHoras;
		this.valorHoras = valorHoras;
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

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public double getValorHoras() {
		return valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double calculaSalario() {
		return quantidadeHoras * valorHoras;
	}

	public String informacaoSalario() {
		String informacao;

		if (calculaSalario() <= 18000) {
			
			informacao = "abaixo do limite";
			
		} else {
			
			informacao = "Acima do limite";
			
		}

		return informacao;

	}

}

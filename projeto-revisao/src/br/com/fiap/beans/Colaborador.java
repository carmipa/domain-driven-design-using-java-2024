package br.com.fiap.beans;

public class Colaborador {

	private int codigo;
	private String nome;
	private String cargo;
	private int quantidaHoras;
	private double valorHora;
	private Endereco endereco;

	// metodo costrutor vazio

	public Colaborador() {

		super();
	}

	public Colaborador(int codigo, String nome, String cargo, int quantidadeHoras, double valorHora) {

		super();

		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.quantidaHoras = quantidadeHoras;
		this.valorHora = valorHora;
	}

	// metodos workers

	public double salario() {

		return this.quantidaHoras * this.valorHora;
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

	public int getQuantidaHoras() {
		return quantidaHoras;
	}

	public void setQuantidaHoras(int quantidaHoras) {
		this.quantidaHoras = quantidaHoras;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}

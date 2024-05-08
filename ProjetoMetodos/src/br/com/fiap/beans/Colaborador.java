package br.com.fiap.beans;

public class Colaborador {
	
	// Visibilidade, tipo de dados e atributos 
	private int codigo;
	private String nome;
	private String cargo;
	private int qtdHoras;
	private double valorHora;
	private Endereco endereco; // atributo de referencia	
	
	// Metodo Construtor vazio 
	public Colaborador() {
		super();
	}
	
	public Colaborador(int codigo, String nome, String cargo, int qtdHoras, double valorHora) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.qtdHoras = qtdHoras;
		this.valorHora = valorHora;
	}
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	// Setters (entrada) e Getters (retornar)
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
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	// Metodos Workers 
	public double salario() {
		return this.qtdHoras * this.valorHora;
	}
	
	

}

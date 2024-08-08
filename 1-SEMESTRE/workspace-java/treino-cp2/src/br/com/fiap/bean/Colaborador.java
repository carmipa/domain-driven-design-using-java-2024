package br.com.fiap.bean;

public class Colaborador {

	private int registro;
	private String nome;
	private String cargo;
	private double salario;
	private Endereco endereco; // atributo de referência
	
	// método contruto vazio

	public Colaborador() {
		super();

	}

	// método contrutor cheio (sem atributo de referência)

	public Colaborador(int registro, String nome, String cargo, double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	// metodos get e set de acesso aos atributos

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}

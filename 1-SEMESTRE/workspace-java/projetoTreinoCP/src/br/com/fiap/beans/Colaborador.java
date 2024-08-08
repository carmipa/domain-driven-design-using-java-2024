package br.com.fiap.beans;

import javax.swing.JOptionPane;

public class Colaborador {

	// visibilidade , tipo de dados e atributos

	private int codigo;
	private String nome;
	private String cpf;
	private String cargo;
	private double renda;
	private Endereco endereco;

	// setter para entrada / getters para o retorno

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public void exibeMenu() {

		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do colaborador :")));
		setNome(JOptionPane.showInputDialog("Nome do colaborador:"));
		setCpf(JOptionPane.showInputDialog("CPF do colaborador:"));
		setCargo(JOptionPane.showInputDialog("Cargo do colaborador:"));
		setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda do colaborador:")));
		

		endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro do colaborador"));
	}

}

package br.com.fiap.beans;

import javax.swing.JOptionPane;

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
	
	public void listaColaborador() {
		
		Colaborador colaborador = new Colaborador();
		Endereco enderecoColaborador = new Endereco();
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABOADOR");
		
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código:")));
		setNome(JOptionPane.showInputDialog("Nome:"));
		setCargo(JOptionPane.showInputDialog("Cargo:"));
		setQuantidaHoras(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas:")));
		setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Valor Hora")));
		
		JOptionPane.showMessageDialog(null, "ENDEREÇO DO COLABORADOR");
		
		enderecoColaborador.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		enderecoColaborador.setCep(JOptionPane.showInputDialog("CEP:"));
		enderecoColaborador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número:")));
		enderecoColaborador.setBairro(JOptionPane.showInputDialog("Bairro:"));
		
		colaborador.setEndereco(enderecoColaborador);
		
		JOptionPane.showInternalMessageDialog(null, "COLABORADOR"
                + "\n******************************************************************************"
                + "\nDADOS DO COLABORADOR..............................................:"
                + "\nCódigo :" + colaborador.getCargo()
                + "\nNome: " + colaborador.getNome()
                + "\nCargo: " + colaborador.getCargo()
                + "\nQuantidade de horas: " + colaborador.getQuantidaHoras()
                + "\nValor hora R$: " + colaborador.getValorHora()
                + "\nENDEREÇO DO COLABORADOR..............................................:"
                + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
                + "\nNúmero: " + colaborador.getEndereco().getNumero()
                + "\nCEP: " + colaborador.getEndereco().getCep()
                + "\nBairro: " + colaborador.getEndereco().getBairro()
                + "\n..............................................\n"
                + "SALÁRIO R$: " + colaborador.salario()
                + "\n.............................................."
                + "\n******************************************************************************");
		
	}

}

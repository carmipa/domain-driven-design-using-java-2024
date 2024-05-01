package br.com.fiap.bean;

public abstract class Cartao {

	private String banco;
	private String bandeira;
	private String validade;
	private int cvv;
	private int numero;
	private double saldo;
	private double compra;
	
	// metodo contrutor vazio
	
	public Cartao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// metodo construtor cheio

	public Cartao(String banco, String bandeira, String validade, int cvv, int numero, double saldo, double compra) {
		super();
		this.banco = banco;
		this.bandeira = bandeira;
		this.validade = validade;
		this.cvv = cvv;
		this.numero = numero;
		this.saldo = saldo;
		this.compra = compra;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getCompra() {
		return compra;
	}

	public void setCompra(double compra) {
		this.compra = compra;
	}

}

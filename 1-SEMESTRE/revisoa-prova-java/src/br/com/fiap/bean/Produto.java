package br.com.fiap.bean;

public class Produto {

	private long codigo;
	private String tipo;
	private String marca;
	private double preco;

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produto(long codigo, String tipo, String marca, double preco) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", tipo=" + tipo + ", marca=" + marca + ", preco=" + preco + "]";
	}
	
	

}

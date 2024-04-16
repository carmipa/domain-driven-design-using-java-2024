package br.com.fiap.beans;

public class Orcamento {

	private int codigo;
	private String pecasUsadas;
	private Double valorPeça;
	private Double maoDeObra;
	private Cliente cliente;

	public Orcamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orcamento(int codigo, String pecasUsadas, Double valorPeça, Double maoDeObra) {
		super();
		this.codigo = codigo;
		this.pecasUsadas = pecasUsadas;
		this.valorPeça = valorPeça;
		this.maoDeObra = maoDeObra;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPecasUsadas() {
		return pecasUsadas;
	}

	public void setPecasUsadas(String pecasUsadas) {
		this.pecasUsadas = pecasUsadas;
	}

	public Double getValorPeça() {
		return valorPeça;
	}

	public void setValorPeça(Double valorPeça) {
		this.valorPeça = valorPeça;
	}

	public Double getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(Double maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

package br.com.fiap.beans;

public class Pagamento {

	private int codigo;
	private String formaPagamento;
	private String desconto;
	private Double valorComDesconto;
	private Double valorParcela;
	private Double valorTotal;
	private Orcamento orcamento;

	public Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pagamento(int codigo, String formaPagamento, String desconto, Double valorComDesconto, Double valorParcela,
			Double valorTotal) {
		super();
		this.codigo = codigo;
		this.formaPagamento = formaPagamento;
		this.desconto = desconto;
		this.valorComDesconto = valorComDesconto;
		this.valorParcela = valorParcela;
		this.valorTotal = valorTotal;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public Double getValorComDesconto() {
		return valorComDesconto;
	}

	public void setValorComDesconto(Double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}

package com.local.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	public Produto() {
		
	}
	
	private String descricao;
	private BigDecimal valor;
	private BigDecimal valorLiquido;
	private BigDecimal aliquota;
	private TipoProduto tipoProduto;


	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getValor() {
		
		BigDecimal valorImposto = valorLiquido.multiply(aliquota.divide(new BigDecimal(100)));
		
		return valorLiquido.add(valorImposto);
	}
                 

	
	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public BigDecimal getAliquota() {
		return aliquota;
	}
	public void setAliquota(BigDecimal aliquota) {
		this.aliquota = aliquota;
	}
	
	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	
	
	
}

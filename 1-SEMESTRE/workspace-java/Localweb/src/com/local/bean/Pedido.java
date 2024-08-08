package com.local.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Pedido() {
		
	}
	public Pedido(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	private List<Produto> produtos;

	public List<Produto> getProduto() {
		return produtos;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produtos = produto;
	}

	
	
	
	

}

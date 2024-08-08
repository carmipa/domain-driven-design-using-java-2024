package com.local.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class NotaFiscal implements Serializable {

	private static final long serialVersionUID = 1L;

	public NotaFiscal(Cliente cliente) {
		this.cliente = cliente;
		this.pedidos = cliente.getPedidos();
	}

	
	private Cliente cliente;
	private List<Pedido> pedidos;
	private Calendar dataEmissao = Calendar.getInstance();

	
	public void imprimeDetalhes() {
		
		BigDecimal valorBruto = BigDecimal.ZERO;
		Iterator<Pedido> itPedido = pedidos.iterator();
			
			while (itPedido.hasNext()) {
				Pedido item = itPedido.next();

				
				Iterator<Produto> itProduto = item.getProduto().iterator();
					while (itProduto.hasNext()) {
						Produto itemProduto = itProduto.next();
						// Caso o valor seja igual a zero nao entra na NF
						if (itemProduto.getAliquota().compareTo(BigDecimal.ZERO) != 0) {							

							System.out.print(itemProduto.getDescricao()+" - "+ itemProduto.getTipoProduto().descricao());
							System.out.print(" - " + itemProduto.getValor());
							valorBruto = valorBruto.add(itemProduto.getValor());

							System.out.println();
						}
					}
	 		}
			System.out.println("Valor Total da NF: " + valorBruto);
	
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}

package com.local.main;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;

import com.local.bean.Cliente;
import com.local.bean.NotaFiscal;
import com.local.bean.Pedido;
import com.local.bean.Produto;
import com.local.bean.TipoProduto;

public class Teste implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	
			
		
		//valor1
		
		
		
		Produto prod1 = new Produto();
		
		prod1.setAliquota(new BigDecimal(0));
		prod1.setDescricao("www.cabelo.com.br");
		prod1.setValorLiquido(new BigDecimal(100));
		prod1.setTipoProduto(TipoProduto.HospedagemdeSites);
				
		
		
		
		//valor 2
		
		Produto prod2 = new Produto();
		
		prod2.setAliquota(new BigDecimal(5));
		prod2.setDescricao("www.lojadecadeiras.com.br");
		prod2.setValorLiquido(new BigDecimal(1000));
		prod2.setTipoProduto(TipoProduto.LojaVirtual);
		
		
		
		//valor 3
		
		Produto prod3 = new Produto();

		prod3.setAliquota(new BigDecimal(5));
		prod3.setDescricao("www.CCt.com.br");
		prod3.setValorLiquido(new BigDecimal(10000));
		prod3.setTipoProduto(TipoProduto.ServidorCloud);

		Produto prod4 = new Produto();

		prod4.setAliquota(new BigDecimal(5));
		prod4.setDescricao("www.CCt.com");
		prod4.setValorLiquido(new BigDecimal(12000));
		prod4.setTipoProduto(TipoProduto.ServidorCloud);

		Produto prod5 = new Produto();

		prod5.setAliquota(new BigDecimal(5));
		prod5.setDescricao("LOJA CCTB");
		prod5.setValorLiquido(new BigDecimal(5000));
		prod5.setTipoProduto(TipoProduto.LojaVirtual);

		
		
		ArrayList<Produto> produtos1 = new ArrayList<Produto>();
		produtos1.add(prod1);
		produtos1.add(prod2);
		produtos1.add(prod3);

		ArrayList<Produto> produtos2 = new ArrayList<Produto>();
		produtos2.add(prod1);
		produtos2.add(prod1);
		produtos2.add(prod3);
		produtos2.add(prod4);

		ArrayList<Produto> produtos3 = new ArrayList<Produto>();
		produtos3.add(prod1);
		produtos3.add(prod1);
		produtos3.add(prod2);
		produtos3.add(prod5);
		
		
		// Pedidos
		Pedido ped1 = new Pedido(produtos1);
		Pedido ped2 = new Pedido(produtos2);
		Pedido ped3 = new Pedido(produtos3);
		

		
		Cliente c1 = new Cliente();

		c1.setNome("xpto");
		c1.setEmail("lojacadeiras@www.com.br");
		c1.setData(Calendar.getInstance());
		c1.setCpfCnpj("999.999.999-99");		
		c1.setTelefone("9999-9999");
		ArrayList<Pedido> pedidosClientes1 = new ArrayList<Pedido>();
		pedidosClientes1.add(ped1);
		pedidosClientes1.add(ped2);
		c1.setPedidos(pedidosClientes1);
		
		Cliente c2 = new Cliente();

		c2.setNome("asdd");
		c2.setEmail("asdd@www.com.br");
		c2.setData(Calendar.getInstance());
		c2.setCpfCnpj("888.888.888-88");		
		c2.setTelefone("88888-8888");
		ArrayList<Pedido> pedidosClientes2 = new ArrayList<Pedido>();
		pedidosClientes2.add(ped3);
		c2.setPedidos(pedidosClientes2);

		
		Cliente c3 = new Cliente();

		c3.setNome("cht");
		c3.setEmail("cht@www.com.br");
		c3.setData(Calendar.getInstance());
		c3.setCpfCnpj("777.777.777-77");		
		c3.setTelefone("77777-7777");
		ArrayList<Pedido> pedidosClientes3 = new ArrayList<Pedido>();
		pedidosClientes3.add(ped2);
		c3.setPedidos(pedidosClientes3);		
		
		

	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	clientes.add(c1);
	clientes.add(c2);
	clientes.add(c3);
	
	for (int i=0; i < clientes.size(); i++) {
		
		Cliente cli = clientes.get(i); 
		
		cli.imprimeDetalhes();
		NotaFiscal nf = new NotaFiscal(cli);
		nf.imprimeDetalhes();
		System.out.println();
		
	}
	
	
		
	}

}

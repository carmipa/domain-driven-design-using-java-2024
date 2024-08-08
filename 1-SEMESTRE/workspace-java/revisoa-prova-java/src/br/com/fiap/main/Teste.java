package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Cliente;
import br.com.fiap.bean.Endereco;
import br.com.fiap.bean.Produto;

public class Teste {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE");
		
		Cliente cliente = new Cliente(
				Long.parseLong(JOptionPane.showInputDialog("Código:")),
				JOptionPane.showInputDialog("Nome:"),
				Double.parseDouble(JOptionPane.showInputDialog("Renda:"))
				);
		JOptionPane.showMessageDialog(null, "ENDEREÇO DO CLIENTE");
		
		Endereco endereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Número:")),
				JOptionPane.showInputDialog("Bairro:")
				);
		
		JOptionPane.showMessageDialog(null, "DADOS DO PRODUTO DO CLIENTE");
		
		Produto produto = new Produto(
				Long.parseLong(JOptionPane.showInputDialog("Código do produto")),
				JOptionPane.showInputDialog("Tipo de produto:"),
				JOptionPane.showInputDialog("Marca do produto:"),
				Double.parseDouble(JOptionPane.showInputDialog("Preço do produto:"))
				);
		
		cliente.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, "DADOS DE COMPRA DO CLIENTE"
				                          + "\n"
				                          + "\nDADOS DO CLIENTE:"
				                          + "\n"
				                          + "\nCódigo do cliente: " + cliente.getCodigo()
				                          + "\nNome do cliente: " + cliente.getNome()
				                          + "\nRenda do cliente R$: " +cliente.getRenda()
				                          + "\n"
				                          + "\nENDEREÇO DO CLIENTE:"
				                          + "\n"
				                          + "\nLogradouro: " + cliente.getEndereco().getLogradouro()
				                          + "\nNúmero: " + cliente.getEndereco().getNumero()
				                          + "\nBairro: " + cliente.getEndereco().getBairro()
				                          + "\n"
				                          + "\nPRODUTOS DO CLIENTE:"
				                          + "\n"
				                          + "\nCódigo do produto: " + produto.getCodigo()
				                          + "\nTIpo do produto: " + produto.getTipo()
				                          + "\nMarca do produto: " + produto.getMarca()
				                          + "\nPreço do produto R$: " + produto.getPreco()
				                          + "\n"
				                          + "\n" + cliente.toString()
				                          + "\n"
				                          + "\n" + endereco.toString()
				                          + "\n"
				                          + "\n" + produto.toString()
				                          );
		

	}

}

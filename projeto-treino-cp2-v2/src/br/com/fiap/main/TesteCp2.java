package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteCp2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE");
		
		Cliente cliente = new Cliente(
				Integer.parseInt(JOptionPane.showInputDialog("Código do cliente:")),
				JOptionPane.showInputDialog("Nome do Cliente:"),
				JOptionPane.showInputDialog("Data da compra:"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor da compra:"))
				);
		
		JOptionPane.showMessageDialog(null, "ENDEREÇO DO CLIENTE");
		
		Endereco endereco = new Endereco(
				Integer.parseInt(JOptionPane.showInputDialog("Código do endereço:")),
				JOptionPane.showInputDialog("Logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Número:")),
				JOptionPane.showInputDialog("CEP:")
				);
		
		JOptionPane.showMessageDialog(null, "DADOS DA EMPRESA");
		
		Empresa empresa = new Empresa(
				Integer.parseInt(JOptionPane.showInputDialog("Código da empresa:")),
				JOptionPane.showInputDialog("CNPJ da empresa:"),
				JOptionPane.showInputDialog("Razão social da empresa:")
				
				);
		
		cliente.setEndereco(endereco);
	
		
		JOptionPane.showMessageDialog(null, "DADOS DO CLIENTE:"
										  + "\n"
										  + "\nCódigo do cliente: " + cliente.getCodigo()
										  + "\nNome: " + cliente.getNome()
										  + "\nData da Compra: " + cliente.getDataCompra()
										  + "\nValor da compra R$: " + cliente.getValorCompra()
										  + "\n"
										  + "ENDEREÇO DO CLIENTE:"
										  + "\n"
										  + "\nCódigo do endereço: " + cliente.getEndereco().getCodigo()
										  + "\nLogradouro: " + cliente.getEndereco().getLogradouro()
										  + "\nNúmero: " + cliente.getEndereco().getNumero()
										  + "\nCEP: " + cliente.getEndereco().getCep()
										  + "\n"
										  + "\nDADOS DA EMPRESA:"
										  + "\n"
										  + "\nCódigo da Empresa : " + empresa.getCodigo()
										  + "\nCNPJ: " + empresa.getCnpj()
										  + "\nRazão Social: " + empresa.getRazaoSocial()
										  + "\n"
				);

	}

}

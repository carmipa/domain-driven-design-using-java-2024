package br.com.fiap.BO;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class EmpresaBO {
	
	Empresa empresa = new Empresa();
	Endereco endereco = new Endereco();
	
	public void menuEmpresa() {
		
		empresa.setCnpj(JOptionPane.showInputDialog("CNPJ da empresa:"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Razão social da empresa"));
		endereco.setLogradouto(JOptionPane.showInputDialog("Logradouro da Empresa"));
		endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da empresa:")));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro da empresa:"));
		endereco.setCep(JOptionPane.showInputDialog("CEP da empresa:"));
		
	}
	
	public void exibeEmpresa() {
		
		JOptionPane.showMessageDialog(null, "Dados da empresa:"
				                          + "\nCNPJ: " + empresa.getCnpj()
				                          + "\nRazão Social: " + empresa.getRazaoSocial()
				                          + "\nEndereço da empresa:"
				                          + "\nLogradouro: " + endereco.getLogradouto()
				                          + "\nNúmero: " + endereco.getNumero()
				                          + "\nBairro: " + endereco.getBairro()
				                          + "\nCEP: " + endereco.getCep());
	}


}

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {

		Colaborador colaborador = new Colaborador();
		Endereco enderecoColaborador = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco enderecoEmpresa = new Endereco();
			
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do Colaborador:")));
		colaborador.setNome(JOptionPane.showInputDialog("Nome do colaborador:"));
		colaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do colaborador:")));
		colaborador.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Digite a renda:")));
		enderecoColaborador.setLogradouto(JOptionPane.showInputDialog("Endereço do colaborador:"));
		enderecoColaborador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número do colaborador:")));
		enderecoColaborador.setBairro(JOptionPane.showInputDialog("Bairro do colaborador:"));
		enderecoColaborador.setCep(JOptionPane.showInputDialog("CEP do colaborador:"));
		
		empresa.setCnpj(JOptionPane.showInputDialog("CNPJ da empresa:"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Razão social da empresa:"));
		enderecoEmpresa.setLogradouto(JOptionPane.showInputDialog("Logradouro da empresa:"));
		enderecoEmpresa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da empresa:")));
		enderecoEmpresa.setBairro(JOptionPane.showInputDialog("Bairro da empresa:"));
		enderecoEmpresa.setCep(JOptionPane.showInputDialog("CEP da empresa:"));
		
		
		
		JOptionPane.showMessageDialog(null, "Dados do Colaborador:"
				                        + "\nCódigo do Colaborador......: " + colaborador.getCodigo()
		                                + "\nNome do colaborador........: " + colaborador.getIdade()
		                                + "\nIdade do colaorador........: " + colaborador.getIdade()
		                                + "\nRenda do colaborador.......: " + colaborador.getRenda()
		                                + "\n"
		                                + "Endereço do colaborador:\n"
		                                + "\nLogradouro do colaborador..: " + enderecoColaborador.getLogradouto()
		                                + "\nNúmero do colaborador......: " + enderecoColaborador.getNumero()
		                                + "\nBairro do colaborador......: " + enderecoColaborador.getBairro()
		                                + "\nCEP........................: " + enderecoColaborador.getCep());
		
		JOptionPane.showMessageDialog(null, "Dados da empresa:"
				                         + "\nCNPJ da empresa: " + empresa.getCnpj()
				                         + "\nRazão social da empresa: " + empresa.getRazaoSocial()
				                         + "\n"
				                         + "\nnEndereço da empresa:\n"
				                         + "\nLogradouro da empresa: " + enderecoEmpresa.getLogradouto()
				                         + "\nNúmero da empresa: " + enderecoEmpresa.getNumero()
				                         + "\nBairro da Empresa: " + enderecoEmpresa.getBairro()
				                         + "\nCEP da empresa: " + enderecoEmpresa.getCep());
		
	}

}

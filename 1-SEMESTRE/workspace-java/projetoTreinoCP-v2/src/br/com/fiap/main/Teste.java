package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		Endereco endereco = new Endereco();
		
		// entrada colaborador
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do colaborador:")));
		colaborador.setNome(JOptionPane.showInputDialog("Nome do colaborador:"));
		colaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do colaborador:")));
		colaborador.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda do Colaborador R$:")));
		
		colaborador.setEndereco(colaboradorEndereco);
		
		colaboradorEndereco.setLogradouro(JOptionPane.showInputDialog("Logradouro do colaborador:"));
		colaboradorEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número do colaborador:")));
		colaboradorEndereco.setBairro(JOptionPane.showInputDialog("Bairro do colaborador:"));
		colaboradorEndereco.setCep(JOptionPane.showInputDialog("CEP do colaborador"));
		
		// saída colaborador
		
		JOptionPane.showMessageDialog(null, "................................................"
				                          +  "Dados do colaborador:"
				                          + "................................................\n"
				                          + "\nCódigo: " + colaborador.getCodigo()
				                          + "\nNome: " + colaborador.getIdade()
				                          + "\nIdade: " + colaborador.getIdade()
				                          + "\nRenda R$: " + colaborador.getRenda()
				                          + "\n................................................"
				                          + "Endereço do colaborador:"
				                          + "................................................\n"
				                          + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                          + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                          + "\nBairro: " + colaborador.getEndereco().getBairro()
				                          + "\nCEP: " + colaborador.getEndereco().getCep());
		
		System.out.println("................................................"
				         + "\nDados do colaborador:"
                         + "\n................................................"
                         + "\nCódigo.....: " + colaborador.getCodigo()
                         + "\nNome.......: " + colaborador.getIdade()
                         + "\nIdade......: " + colaborador.getIdade()
                         + "\nRenda......: " + colaborador.getRenda()
                         + "\n................................................"
                         + "\nEndereço do colaborador:"
                         + "\n................................................"
                         + "\nLogradouro.: " + colaborador.getEndereco().getLogradouro()
                         + "\nNúmero.....: " + colaborador.getEndereco().getNumero()
                         + "\nBairro.....: " + colaborador.getEndereco().getBairro()
                         + "\nCEP........: " + colaborador.getEndereco().getCep()
                         + "\n"
                         + "\n"
                         + "\n");
		
		
		// entrada empresa
		
		empresa.setCnpj(JOptionPane.showInputDialog("CNPJ da empresa:"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Razão social da empresa:"));
		
		empresa.setEndereco(empresaEndereco);
		
		empresaEndereco.setLogradouro(JOptionPane.showInputDialog("Logradouro da empresa:"));
		empresaEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da empresa:")));
		empresaEndereco.setBairro(JOptionPane.showInputDialog("Bairro da empresa:"));
		empresaEndereco.setCep(JOptionPane.showInputDialog("CEP da empresa:"));
		
		// saída empresa
		
		JOptionPane.showInternalMessageDialog(null, "................................................"  
				                                  + "Dados da Empresa:"
				                                  + "................................................\n"
				                                  + "\nCNPJ: " + empresa.getCnpj()
				                                  + "\nRazão Social: " + empresa.getRazaoSocial()
				                                  + "\n................................................"
				                                  + "Endereço da empresa:"
				                                  + "................................................\n"
				                                  + "\nLogradouro: " + empresa.getEndereco().getLogradouro()
				                                  + "\nNúmero: " + empresa.getEndereco().getNumero()
				                                  + "\nBairro: " + empresa.getEndereco().getBairro()
				                                  + "\nCEP: " + empresa.getEndereco().getCep());
		
		System.out.println("................................................"  
				         + "\nDados da Empresa:"
				         + "\n................................................"
				         + "\nCNPJ.........: " + empresa.getCnpj()
				         + "\nRazão Social.: " + empresa.getRazaoSocial()
				         + "\n................................................"
				         + "\nEndereço da empresa:"
				         + "\n................................................"
				         + "\nLogradouro...: " + empresa.getEndereco().getLogradouro()
				         + "\nNúmero.......: " + empresa.getEndereco().getNumero()
				         + "\nBairro.......: " + empresa.getEndereco().getBairro()
				         + "\nCEP..........: " + empresa.getEndereco().getCep());
	
	}

}

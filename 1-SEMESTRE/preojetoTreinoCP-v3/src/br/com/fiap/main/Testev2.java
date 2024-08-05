package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Testev2 {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		// colaborador
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do colaborador")));
		colaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		colaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do colaborador"));
		colaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do colaborador")));
		
		colaboradorEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro da colaborador"));
		colaboradorEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do colaborador")));
		colaboradorEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP do colaborador"));
		colaboradorEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do colaborador"));
		colaboradorEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do colaborador"));
		colaboradorEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade do colaborador"));
		
		colaborador.setEndereco(empresaEndereco);
		
		JOptionPane.showMessageDialog(null, "****Dados do colaborador****"
				                          + "\nCódigo: "      + colaborador.getCodigo()
				                          + "\nNome: "        + colaborador.getNome()
				                          + "\nCargo: "       + colaborador.getCargo()
				                          + "\nSalário: "     + colaborador.getSalario()
				                          + "\n****Endereço do colaborador****"
				                          + "\nLogradouro: "  + colaborador.getEndereco().getLogradouro()
				                          + "\nNúmero: "      + colaborador.getEndereco().getNumero()
				                          + "\nCEP: "         + colaborador.getEndereco().getCep()
				                          + "\nComplemento: " + colaborador.getEndereco().getComplemento()
				                          + "\nBairro: "      + colaborador.getEndereco().getBairro()
				                          + "\nCidade: "      + colaborador.getEndereco().getCidade());
		
		// Empresa
		
		empresa.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ da empresa"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social da empresa"));
		
		empresaEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro da empresa"));
		empresaEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da empresa")));
		empresaEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP da empresa"));
		empresaEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento da empresa"));
		empresaEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro da empresa"));
		empresaEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade da empresa"));
		
		empresa.setEndereco(empresaEndereco);
		
		JOptionPane.showMessageDialog(null, "****Dados da Empresa****"
		                                  + "\nCNPJ: "         + empresa.getCnpj()
		                                  + "\nRazão Social: " + empresa.getRazaoSocial()
		                                  + "\n****Endereço da empresa****"
		                                  + "\nlogradouro: "   + empresa.getEndereco().getLogradouro()
		                                  + "\nNúmero: "       + empresa.getEndereco().getNumero()
		                                  + "\nCEP: "          + empresa.getEndereco().getCep()
		                                  + "\nComplemento: "  + empresa.getEndereco().getCep()
		                                  + "\nBairro: "       + empresa.getEndereco().getBairro()
		                                  + "\nCidade: "       + empresa.getEndereco().getCidade());

	}

}


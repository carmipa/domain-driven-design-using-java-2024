package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class teste3 {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		JOptionPane.showMessageDialog(null, "Dados do colaborador");
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do colaborador")));
		colaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		colaborador.setCargo(JOptionPane.showInputDialog("Digite o cargo do colaborador"));
		colaborador.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do colaborador")));
		colaboradorEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro do colaborador"));
		colaboradorEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP do colaborador"));
		colaboradorEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do logradouro do colaborador")));
		colaboradorEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro do colaborador"));
		colaboradorEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade do colaborador"));
		colaboradorEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do endereço do colaborador"));
		
		JOptionPane.showMessageDialog(null, "Dados da empresa");
		
		empresa.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ da empresa"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social da empresa"));
		empresaEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro da empresa"));
		empresaEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP da empresa"));
		empresaEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do endereço da empresa")));
		empresaEndereco.setBairro(JOptionPane.showInputDialog("Digite o bairro da empresa"));
		empresaEndereco.setCidade(JOptionPane.showInputDialog("Digite a cidade da empresa"));
		empresaEndereco.setComplemento(JOptionPane.showInputDialog("Digite o complemento do endereço da empresa"));
		
		colaborador.setEndereco(empresaEndereco);
		empresa.setEndereco(empresaEndereco);
		
		JOptionPane.showMessageDialog(null, "****************************************************************"
				                          + "\nDados do colaborador:"
				                          + "\nCódigo: " + colaborador.getCodigo()
				                          + "\nNome: " + colaborador.getNome()
				                          + "\nCargo: " + colaborador.getCargo()
				                          + "\nSalário: " + colaborador.getSalario()
				                          + "\n..............................................................."
				                          + "\nEndereço do colaborador:"
				                          + "\nLogradouro: "+ colaborador.getEndereco().getLogradouro()
				                          + "\nCEP: " + colaborador.getEndereco().getCep()
				                          + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                          + "\nBairro: " + colaborador.getEndereco().getBairro()
				                          + "\nCidade: " + colaborador.getEndereco().getCidade()
				                          + "\nComplemento: " + colaborador.getEndereco().getComplemento()
				                          + "\n"
				                          + "\n****************************************************************"
				                          + "\n"
				                          + "\nDados da empresa:"
				                          + "\nCNPJ: " + empresa.getCnpj()
				                          + "\nRazão social: " + empresa.getRazaoSocial()
				                          + "\n..............................................................."
				                          + "\nEndereço da empresa:"
				                          + "\nLogradouro: " + empresa.getEndereco().getLogradouro()
				                          + "CEP: " + empresa.getEndereco().getCep()
				                          + "\nNúmero: " + empresa.getEndereco().getNumero()
				                          + "\nBairro: " + empresa.getEndereco().getBairro()
				                          + "\nCidade: " + empresa.getEndereco().getCidade()
				                          + "\nComplemento: " + empresa.getEndereco().getComplemento()
				                          + "\n****************************************************************");
		
		
		

	}

}

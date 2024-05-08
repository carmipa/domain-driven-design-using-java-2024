package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Colaborador;
import br.com.fiap.bean.Empresa;
import br.com.fiap.bean.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Dados do colaborador:" , "Dados do Colaborador", JOptionPane.INFORMATION_MESSAGE);
		
		Colaborador colaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog(null, "Número de registro do colaborador:" , "Número de registro do colaborador", JOptionPane.INFORMATION_MESSAGE)),
				JOptionPane.showInputDialog("Nome do colaborador:"),
				JOptionPane.showInputDialog("Cargo do colaborador:"),
				Double.parseDouble(JOptionPane.showInputDialog("Salário do colaborador:"))
				);
		
		JOptionPane.showInternalMessageDialog(null, "Endereço do colaborador:");
		
		Endereco endereco = new Endereco(
				Integer.parseInt(JOptionPane.showInputDialog("Número:")),
				JOptionPane.showInputDialog("Logradouro:"),
				JOptionPane.showInputDialog("Bairro:"),
				JOptionPane.showInputDialog("CEP:"),
				JOptionPane.showInputDialog("Complemento")
				);
		
		JOptionPane.showInternalMessageDialog(null, "Dados da empresa:");
		
		Empresa empresa = new Empresa(
				JOptionPane.showInputDialog("CNPJ da empresa:"),
				JOptionPane.showInputDialog("Razão social:")
				);
		
		colaborador.setEndereco(endereco);
		
		
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR:"
				                          + "\nRegistro: " + colaborador.getRegistro()
				                          + "\nNome: " + colaborador.getNome()
				                          + "\nCargo: " + colaborador.getCargo()
				                          + "\nSalário R$: " + colaborador.getSalario()
				                          + "\n"
				                          + "\nENDEREÇO DO COLABORADOR:"
				                          + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                          + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                          + "\nBairro: " + colaborador.getEndereco().getBairro()
				                          + "\nCEP: " + colaborador.getEndereco().getCep()
				                          + "\nComplemento: " + colaborador.getEndereco().getComplemento()
				                          + "\n"
				                          + "\nDADOS DA EMPRESA:"
				                          + "\nCNPJ: " + empresa.getCnpj()
				                          + "\nRazão Social: " + empresa.getRazaoSocial()
				                          );
	}

}

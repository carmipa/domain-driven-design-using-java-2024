package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Colaborador;
import br.com.fiap.bean.Empresa;
import br.com.fiap.bean.Endereco;

public class Teste {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR");
		
		Colaborador colaborador = new Colaborador(Integer.parseInt(JOptionPane.showInputDialog("Registro do colaborador")),
			                                      JOptionPane.showInputDialog("Nome do colaborador"),
			                                      JOptionPane.showInputDialog("Cargo do colaborador:"),
			                                      Double.parseDouble(JOptionPane.showInputDialog("Salário")));
		
		JOptionPane.showInternalMessageDialog(null, "ENDEREÇO");
		Endereco endereco = new Endereco(JOptionPane.showInputDialog("CEP: "),
				                         JOptionPane.showInputDialog("Logradouro: "));
		
		JOptionPane.showMessageDialog(null, "EMPRESA");
		Empresa empresa = new Empresa(JOptionPane.showInputDialog("CNPJ: "),
				                      JOptionPane.showInputDialog("Razão social: "));
		
		colaborador.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR:"
				                          + "\nRegistro do colaborador: " + colaborador.getRegistro()
				                          + "\nNome do colaborador: " + colaborador.getNome()
				                          + "\nCargo do colaborador: " + colaborador.getCargo()
				                          + "\nSalário: " + colaborador.getSalario()
				                          + "\n"
				                          + "\nENDEREÇO:"
				                          + "\nCEP: " + colaborador.getEndereco().getCep()
				                          + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                          + "\n"
				                          + "\nEMPRESA: "
				                          + "\nCNPJ: " + empresa.getCnpj()
				                          + "\nRazão social: "+ empresa.getRazaoSocial()
				                          + "\n");
		
	}

}

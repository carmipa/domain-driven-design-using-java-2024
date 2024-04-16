package br.com.fiap.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteConstrutor {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);

		// construtor colaborador
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR");
		
		Colaborador colaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("codigo")),
				JOptionPane.showInputDialog("Informe o nome do colaborador"),
				JOptionPane.showInputDialog("Informe o Cargo"),
				Integer.parseInt(JOptionPane.showInputDialog("quantas Horas?")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Hora"))
				);
		
		JOptionPane.showInternalMessageDialog(null, "ENDEREÇO DO COLABORADOR");
		
		Endereco colaboradorEndereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Nùmero:")),
				JOptionPane.showInputDialog("CEP:"),
				JOptionPane.showInputDialog("Bairro:")
				);
		
		colaborador.setEndereco(colaboradorEndereco);
		
		JOptionPane.showInternalMessageDialog(null, "COLABORADOR"
				                                  + "\n******************************************************************************"
				                                  + "\nDADOS DO COLABORADOR..............................................:"
				                                  + "\nCódigo :" + colaborador.getCargo()
				                                  + "\nNome: " + colaborador.getNome()
				                                  + "\nCargo: " + colaborador.getCargo()
				                                  + "\nQuantidade de horas: " + colaborador.getQuantidaHoras()
				                                  + "\nValor hora R$: " + colaborador.getValorHora()
				                                  + "\nENDEREÇO DO COLABORADOR..............................................:"
				                                  + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                                  + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                                  + "\nCEP: " + colaborador.getEndereco().getCep()
				                                  + "\nBairro: " + colaborador.getEndereco().getBairro()
				                                  + "\n..............................................\n"
				                                  + "SALÁRIO R$: " + colaborador.salario()
				                                  + "\n.............................................."
				                                  + "\n******************************************************************************");
		
		// construtos empresa
		
		JOptionPane.showMessageDialog(null, "DADOS DA EMPRESA");
		
		Empresa empresa = new Empresa(
				JOptionPane.showInputDialog("CNPJ:"),
				JOptionPane.showInputDialog("Razão social:")
				);
		
		
		JOptionPane.showInternalMessageDialog(null, "ENDEREÇO DA EMPRESA");
		
		Endereco empresaEndereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Nùmero:")),
				JOptionPane.showInputDialog("CEP:"),
				JOptionPane.showInputDialog("Bairro:")
				);
		
		empresa.setEndereco(empresaEndereco);
		
		JOptionPane.showInternalMessageDialog(null, "EMPRESA"
                                                  + "\n******************************************************************************"
                                                  + "\nDADOS DA EMPRESA..............................................:"
                                                  + "\nCNPJ: " + empresa.getCnpj()
                                                  + "Razão social: " + empresa.getRazaoSocial()
                                                  + "\nENDEREÇO DA EMPRESA..............................................:"
                                                  + "\nLogradouro: " + empresa.getEndereco().getLogradouro()
                                                  + "\nNúmero: " + empresa.getEndereco().getNumero()
                                                  + "\nCEP: " + empresa.getEndereco().getCep()
                                                  + "\nBairro: " + empresa.getEndereco().getBairro()
                                                  + "\n******************************************************************************");

	}

}

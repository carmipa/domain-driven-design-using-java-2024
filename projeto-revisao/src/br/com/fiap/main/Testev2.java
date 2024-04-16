package br.com.fiap.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Testev2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		// colaborador
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR");
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código:")));
		colaborador.setNome(JOptionPane.showInputDialog("Nome:"));
		colaborador.setCargo(JOptionPane.showInputDialog("Cargo:"));
		colaborador.setQuantidaHoras(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas")));
		colaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Valor hora R$:")));
		
		JOptionPane.showInternalMessageDialog(null, "ENDEREÇO DO COLABORADOR");
		
		colaboradorEndereco.setLogradouro(JOptionPane.showInputDialog("Logradouro:"));
		colaboradorEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Nùmero:")));
		colaboradorEndereco.setCep(JOptionPane.showInputDialog("CEP:"));
		colaboradorEndereco.setBairro(JOptionPane.showInputDialog("Bairro:"));
		
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
		
		// Empresa
		
		JOptionPane.showMessageDialog(null, "DADOS DA EMPRESA");
		
		empresa.setCnpj(JOptionPane.showInputDialog("CNPJ:"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Razão social:"));
		
		JOptionPane.showInternalMessageDialog(null, "ENDEREÇO DA EMPRESA");
		
		empresaEndereco.setLogradouro(JOptionPane.showInputDialog("Logradouro:"));
		empresaEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Nùmero:")));
		empresaEndereco.setCep(JOptionPane.showInputDialog("CEP:"));
		empresaEndereco.setBairro(JOptionPane.showInputDialog("Bairro:"));
		
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

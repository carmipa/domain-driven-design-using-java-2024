package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Pessoa Jurídica");
		
		PessoaJuridica pJuridica = new PessoaJuridica(
				JOptionPane.showInputDialog("Razão Social:"),
				JOptionPane.showInputDialog("E-mail:"),
				Double.parseDouble(JOptionPane.showInputDialog("Receita:")),
				JOptionPane.showInputDialog("CNPJ:")
				
				);
		
		JOptionPane.showMessageDialog(null, "Pessoa Física");
		
		PessoaFisica pFicica = new PessoaFisica(
				JOptionPane.showInputDialog("Nome:"),
				JOptionPane.showInputDialog("E-mail:"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor do salário:")),
				JOptionPane.showInputDialog("CPF:"),
				JOptionPane.showInputDialog("RG:")
				);
		
		
		JOptionPane.showMessageDialog(null, "DADOS DAS PESSOAS"
										  + "\n"
				                          + "PESSOA FíSICA:"
										  + "\nNome: " + pFicica.getNome()
										  + "\nE-mail: " + pFicica.getEmail()
										  + "\nValor: " + pFicica.getValor()
										  + "\nCPF: " + pFicica.getCpf()
										  + "\nRG: " + pFicica.getRg()
										  + "\n"
										  + "\nIdentificador:" + pFicica.identificar() 
										  + "\n"
										  + "\nPESSOA JURÍDICA:"
										  + "\nRazão Social: " + pJuridica.getNome()
										  + "\nE-mail: " + pJuridica.getEmail()
										  + "\nReceita: " + pJuridica.getValor()
										  + "\nCNPJ: " + pJuridica.getCnpj()
										  + "\n"
										  + "\nIdentificador" + pJuridica.identificar()
						  
				);
		
	}

}

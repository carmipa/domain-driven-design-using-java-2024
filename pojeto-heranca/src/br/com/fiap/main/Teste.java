package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class Teste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa(
				JOptionPane.showInputDialog("Nome:"),
				JOptionPane.showInputDialog("E-mail:"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor:"))
				);
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		
		
	}

}

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Endereco;
import br.com.fiap.bean.Pf;
import br.com.fiap.bean.Pj;

public class Teste {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "DADOS DA EMPRESA"); // ou
		
		Pj metodoPj = new Pj();
		
		JOptionPane.showMessageDialog(null, metodoPj.identificar());
		
		Pj pj = new Pj(
				JOptionPane.showInputDialog("Nome da empresa:"),
				JOptionPane.showInputDialog("E-mail:"),
				Double.parseDouble("Valor:"),
				JOptionPane.showInputDialog("CNPJ:"),
				JOptionPane.showInputDialog("Razão Social:")
				
				);
		Endereco enderecoPj = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				JOptionPane.showInputDialog("CEP:")
				);
		
		pj.setEndereco(enderecoPj);
		
		JOptionPane.showMessageDialog(null, "DADOS DA PESSOA FÍSICA"); // ou
		
		Pj metodoPf = new Pj();
		
		JOptionPane.showMessageDialog(null, metodoPf.identificar());
		
		Pf pf = new Pf(
				JOptionPane.showInputDialog("Nome da empresa:"),
				JOptionPane.showInputDialog("E-mail:"),
				Double.parseDouble("Valor:"),
				JOptionPane.showInputDialog("CNPJ:"),
				JOptionPane.showInputDialog("Razão Social:")
				);
		
		Endereco enderecoPf = new Endereco(
				JOptionPane.showInputDialog("Logradouro:"),
				JOptionPane.showInputDialog("CEP:")
				);
		
		pf.setEndereco(enderecoPf);

	}

}

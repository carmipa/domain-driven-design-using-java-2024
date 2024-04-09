package br.com.fiap.main;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Dados do Colaborador");
		Colaborador colaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Digite o código:")),
				JOptionPane.showInputDialog("Digite o nome"),
				JOptionPane.showInputDialog("Digite o cargo:"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas"))
				);
		
		JOptionPane.showMessageDialog(null, "Endereço do Colaborador");
		Endereco endereco = new Endereco(
				JOptionPane.showInputDialog("Digite o logradouro:"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número:")),
				JOptionPane.showInputDialog("Digite o CEP:")
				);
		
		colaborador.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, "Dados do Colaborador"
				                          + "\nCódigo: " + colaborador.getCodigo()
				                          + "\nNome: " + colaborador.getNome()
				                          + "\nCargo: " + colaborador.getCargo()
				                          + "\nValor hora: " + colaborador.getValorHora()
				                          + "\nQuantidade de horas: " + colaborador.getQuantidadeHoras()
				                          + "\n"
				                          + "\nEndereço do colaborador"
				                          + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                          + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                          + "\nCEP: " + colaborador.getEndereco().getCep());
		
		
		
		JOptionPane.showMessageDialog(null, colaborador.toString()
										  + endereco.toString());

	}

}

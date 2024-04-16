package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteMetodoConstrutor {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Dados do colaborador");
		
		Colaborador colaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Código do colaborador:")),
				JOptionPane.showInputDialog("Nome do colaborador:"),
				JOptionPane.showInputDialog("Cargo do colaborador:"),
				Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas:")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor das horas trabalhadas")));
		
		JOptionPane.showMessageDialog(null, "Endereço do colaborador");
		
		Endereco endereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro do colaborador:"),
				Integer.parseInt(JOptionPane.showInputDialog("Número do colaborador:")),
				JOptionPane.showInputDialog("CEP do colaborador:"),
				JOptionPane.showInputDialog("Bairro do colaborador:"));
		
		colaborador.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, "DADOS DO COLABORADOR"
				                          + "\n"
				                          + "\nCódigo: " + colaborador.getCodigo()
				                          + "\nNome: " + colaborador.getNome()
				                          + "\nCargo: " + colaborador.getCargo()
				                          + "\nQuantidade de horas trabalhadas: " + colaborador.getQuantidadeHoras()
				                          + "\nValor da hora trabalhada: " + colaborador.getValorHoras()
				                          + "\nLogradouro: " + colaborador.getEndereco().getLogradouro()
				                          + "\nNúmero: " + colaborador.getEndereco().getNumero()
				                          + "\nCEP: " + colaborador.getEndereco().getCep()
				                          + "\nBairro: " + colaborador.getEndereco().getBairro()
				                          + "\n"
				                          + "\nSalário: R$ " + colaborador.calculaSalario()
				                          + "\nInformação do salário: " + colaborador.informacaoSalario());
		
		
		

	}

}

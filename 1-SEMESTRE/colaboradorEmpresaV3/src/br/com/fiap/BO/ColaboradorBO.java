package br.com.fiap.BO;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class ColaboradorBO {
	
	Colaborador colaborador = new Colaborador();
	Endereco endereco = new Endereco();
	
	public void menuColaborador() {
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do colaborador:")));
		colaborador.setNome(JOptionPane.showInputDialog("Nome do Colaborador:"));
		colaborador.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do colaborador:")));
		colaborador.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda do Colaborador:")));
		endereco.setLogradouto(JOptionPane.showInputDialog("Logradouro:"));
		endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número:")));
		endereco.setBairro(JOptionPane.showInputDialog("Bairro:"));
		endereco.setCep(JOptionPane.showInputDialog("CEP:"));
	}
	
	public void exibeColaborador() {
		
		JOptionPane.showMessageDialog(null,"Dados do colaborador: " 
				                          + "\nCódigo do colaborador: " + colaborador.getCodigo()
		                                  + "\nNome do colaboador:"+ colaborador.getNome()
		                                  + "\nIdade do colaborador: "+ colaborador.getIdade()
		                                  + "\nRenda do colaborador: " + colaborador.getRenda()
		                                  + "\nEndereço do colaborador:"
		                                  + "\nLogradouro: " + endereco.getLogradouto()
		                                  + "\nNúmero: " + endereco.getNumero()
		                                  + "\nBairro: " + endereco.getBairro()
		                                  + "\nCEP: " + endereco.getCep());
		
	}

}

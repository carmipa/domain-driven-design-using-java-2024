package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteToString {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		JOptionPane.showMessageDialog(null, cliente.toString());

	}

}

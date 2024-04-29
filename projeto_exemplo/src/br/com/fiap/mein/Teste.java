package br.com.fiap.mein;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Carro;

public class Teste {

	public static void main(String[] args) {
		
		Carro objetoCarro = new Carro(
				Integer.parseInt(JOptionPane.showInputDialog("código do carro")),
				JOptionPane.showInputDialog("nome")
				);
		
		
		
		System.out.println(objetoCarro.getCodig());
		System.out.println(objetoCarro.getNome());
		// TODO Auto-generated method stub

	}

}

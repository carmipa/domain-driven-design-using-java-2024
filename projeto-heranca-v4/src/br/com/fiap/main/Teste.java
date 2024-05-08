package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Moto;

public class Teste {

	public static void main(String[] args) {
	
		try {
			
			JOptionPane.showMessageDialog(null, "DADOS DO CARRO");
			
			Carro carro = new Carro(
					JOptionPane.showInputDialog("Placa:"),
					JOptionPane.showInputDialog("Marca:"),
					JOptionPane.showInputDialog("Modelo:"),
					Integer.parseInt(JOptionPane.showInputDialog("Ano:")),
					Double.parseDouble(JOptionPane.showInputDialog("Valor:")),
					JOptionPane.showInputDialog("Volante:")
					);
			
			JOptionPane.showMessageDialog(null, carro.identificar() + "\n" + carro.toString());
			
			
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Dado incorreto digite número");
		}
		
		//
				
		try {
			JOptionPane.showMessageDialog(null, "DADOS DA MOTO");
			
			Moto moto = new Moto(
					JOptionPane.showInputDialog("Placa:"),
					JOptionPane.showInputDialog("Marca:"),
					JOptionPane.showInputDialog("Modelo:"),
					Integer.parseInt(JOptionPane.showInputDialog("Ano:")),
					Double.parseDouble(JOptionPane.showInputDialog("Valor:")),
					JOptionPane.showInputDialog("Guidão:")
					);
			
			JOptionPane.showMessageDialog(null, moto.identificar()+ "\n" + moto.toString());
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Dado incorreto");
		}
		

	}

}

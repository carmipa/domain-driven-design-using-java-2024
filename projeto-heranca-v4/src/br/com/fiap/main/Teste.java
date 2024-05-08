package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Moto;

public class Teste {
	
	// metodos staticos
	
	//string
	
	public static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	// int
	
	public static int inteiro(String i) {
		return Integer.parseInt(JOptionPane.showInputDialog(i));
	}
	
	// real = double
	
	public static double real(String d) {
		return Double.parseDouble(JOptionPane.showInputDialog(d));
	}

	public static void main(String[] args) {
	
			Carro carro = new Carro(
					texto("Placa do Carro:"),
					texto("Marca do Carro:"),
					texto("Modelo do Carro:"),
					inteiro("Ano de fabricação:"),
					real("Valor do Carro:"),
					texto("Tipo de volante do carro:")
			/*
			 * JOptionPane.showInputDialog("Placa:"), JOptionPane.showInputDialog("Marca:"),
			 * JOptionPane.showInputDialog("Modelo:"),
			 * Integer.parseInt(JOptionPane.showInputDialog("Ano:")),
			 * Double.parseDouble(JOptionPane.showInputDialog("Valor:")),
			 * JOptionPane.showInputDialog("Volante:")
			 */
					);
			
			JOptionPane.showMessageDialog(null, carro.identificar() + "\n" + carro.toString());

			///////////////////////////////////////////////////////////////////////////////////////

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


	}

}

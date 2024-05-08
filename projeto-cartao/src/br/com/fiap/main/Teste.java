package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.Credito;
import br.com.fiap.bean.Debito;

public class Teste {

	public static void main(String[] args) {
		
		Debito debito  = new Debito(
				JOptionPane.showInputDialog("Nome do banco:"),
				JOptionPane.showInputDialog("Bandeira do cartão de débito:"),
				JOptionPane.showInputDialog("Validade do cartão de debito: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o CVV do cartão:")),
				Integer.parseInt(JOptionPane.showInputDialog("Número do cartão de Débito:")),
				Double.parseDouble(JOptionPane.showInputDialog("Saldo do Cartão:")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor da compra:")),
				Double.parseDouble(JOptionPane.showInputDialog("Quantidade consignada:"))
				);
		
		Credito credito = new Credito(
				JOptionPane.showInputDialog("Nome do banco:"),
				JOptionPane.showInputDialog("Bandeira do cartão:"),
				JOptionPane.showInputDialog("Validade do cartão: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a válidade do cartão:")),
				Integer.parseInt(JOptionPane.showInputDialog("Número do cartão de Crédito:")),
				Double.parseDouble(JOptionPane.showInputDialog("Saldo do Cartão de crédito:")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor da compra:"))
				);

		JOptionPane.showMessageDialog(null, "DADOS DOS CARTÕES:"
				                          + "\n"
				                          + "\nlimite do débito: R$ " + debito.limite()
				                          + "\nLimite do crédito: R$ " + credito.limite()
				                          + "\n"
				                          + "\nCARTÃO DE DÉBITO:"
				                          + "\nBanco: " + debito.getBanco()
				                          + "\nBandeira: " + debito.getBandeira()
				                          + "\nValidade: " + debito.getValidade()
				                          + "\nCVV: " + debito.getCvv()
				                          + "\nNúmero: " + debito.getNumero()
				                          + "\nSaldo: R$ " + debito.getSaldo()
				                          + "\nCompra: R$ " + debito.getCompra()
				                          + "\nConsignado: R$ " + debito.getConsignado()
				                          + "\n"
				                          + "\nStatus da aprovação do débito: " + debito.status()
				                          + "\n"
				                          + "\nCARTÃO DE CRÉDITO:"
				                          + "\n"
				                          + "\nBanco: " + credito.getBanco()
				                          + "\nBandeira: " + credito.getBandeira()
				                          + "\nVálidade: " + credito.getValidade()
				                          + "\nCVV: " + credito.getCvv()
				                          + "\nNúmero: " + credito.getNumero()
				                          + "\nSaldo: R$ " + credito.getSaldo()
				                          + "\nCompra: R$ " + credito.getCompra()
				                          + "\n"
				                          + "\nStatus de aprovação do crédito: " + credito.status()
				                          );
		

	}

}

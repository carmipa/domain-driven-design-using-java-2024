package br.com.fiap.beans;

import javax.swing.JOptionPane;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void exibeMenu() {
		
		setCnpj(JOptionPane.showInputDialog("CNPJ da empresa:"));
		setRazaoSocial(JOptionPane.showInputDialog("Razão social da empresa:"));
		
	}

}

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		// Instanciar objetos 
		Colaborador objColaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("codigo")),
				JOptionPane.showInputDialog("Informe o nome do colaborador"),
				JOptionPane.showInputDialog("Informe o Cargo"),
				Integer.parseInt(JOptionPane.showInputDialog("quantas Horas?")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Hora"))
				);
		
		Empresa objEmpresa = new Empresa();
		Endereco objEndereco = new Endereco();
	
		
		// Entradas Colaborador 
		/*objColaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("codigo")));
		objColaborador.setNome(JOptionPane.showInputDialog("Informe o nome do colaborador"));
		objColaborador.setCargo(JOptionPane.showInputDialog("Informe o Cargo"));
		objColaborador.setQtdHoras(Integer.parseInt(JOptionPane.showInputDialog("quantas Horas?")));
		objColaborador.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Valor Hora")));*/
		
		objEndereco.setLogradouro(JOptionPane.showInputDialog("Informe o Logradouro do colaborador"));
		objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("numero")));
		objEndereco.setCep(JOptionPane.showInputDialog("Informe o CEP"));
		objEndereco.setBairro(JOptionPane.showInputDialog("Informe o Bairro"));
		
		objColaborador.setEndereco(objEndereco);
		
		// Entradas Empresa 
		objEmpresa.setCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa"));
		objEmpresa.setRazaoSocial(JOptionPane.showInputDialog("Informe o nome da Empresa"));
		
		System.out.println("COLABORADOR" + 
		                   "\nCodigo: " + objColaborador.getCodigo() + 
		                   "\nNome: " + objColaborador.getNome() + 
		                   "\nCargo: " + objColaborador.getCargo() + 
		                   "\nQuantidade de Horas: " + objColaborador.getQtdHoras() + 
		                   "\nValor da Hora: " + objColaborador.getValorHora() + 
		                   "\nLOCALIDADE DO COLABORADOR" + 
		                   "\nLogradouro: " + objColaborador.getEndereco().getLogradouro() + 
		                   "\nNumero: " + objColaborador.getEndereco().getNumero() + 
		                   "\nCEP: " + objColaborador.getEndereco().getCep() + 
		                   "\nBairro: " + objColaborador.getEndereco().getBairro() + 
		                   "\n\nEMPRESA" + 
		                   "\nCNPJ: " + objEmpresa.getCnpj() + 
		                   "\nRazao Social: " + objEmpresa.getRazaoSocial());	
		
		
		System.out.println("SALARIO DO COLABORADOR: "  + objColaborador.salario());

	}

}

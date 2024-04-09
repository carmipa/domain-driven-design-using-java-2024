package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {

		Colaborador colaborador = new Colaborador();
		Endereco enderecoColaborador = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco enderecoEmpresa = new Endereco();
		
		colaborador.setCodigo(1);
		colaborador.setNome("Paulo");
		colaborador.setIdade(44);
		colaborador.setRenda(5000);
		
		colaborador.setEndereco(enderecoColaborador);
		
		enderecoColaborador.setLogradouto("rua Laura");
		enderecoColaborador.setNumero(127);
		enderecoColaborador.setBairro("vila leda");
		enderecoColaborador.setCep("07062-031");
		
		empresa.setCnpj("0001/2024");
		empresa.setRazaoSocial("Colégio Presbiteriano");
		
		enderecoEmpresa.setLogradouto("Rua Pianura");
		enderecoEmpresa.setNumero(10);
		enderecoEmpresa.setBairro("Cocaia");
		enderecoEmpresa.setCep("07130-270");
				
		
		System.out.println(".............................................................." +
						   "\n***Dados do Colaborador***" +
						   "\n" +
						   "\nCódigo.......: " + colaborador.getCodigo()+
						   "\nNome.........: " + colaborador.getNome() +
						   "\nIdade........: " + colaborador.getIdade() +
						   "\nIdade........: " + colaborador.getRenda() +
						   "\nLogradouro...: " + enderecoColaborador.getLogradouto() +
						   "\nNúmero.......: " + enderecoColaborador.getNumero() + 
						   "\nBairro.......: " + enderecoColaborador.getBairro() +
						   "\nCEP..........: " + enderecoColaborador.getCep()+
						   "\n" +
						   ".............................................................." +
						   "\n");
		
		System.out.println("***Dados da Empresa***" +
						   "\n" +
						   "\nCNPJ.........: " + empresa.getCnpj() +
						   "\nRazão Social.: " + empresa.getRazaoSocial() +
						   "\nLogradouro...: " + enderecoEmpresa.getLogradouto() + 
						   "\nNúmero.......: " + enderecoEmpresa.getNumero() + 
						   "\nBairro.......: " + enderecoEmpresa.getBairro() +
						   "\nCep..........: " + enderecoEmpresa.getCep() +
						   "\n" +
						   ".............................................................." +
						   "\n");
		
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Código do Colaborador")));
		colaborador.setNome(JOptionPane.showInputDialog("Digite o nome do colaborador"));
		
		
		

	}

}

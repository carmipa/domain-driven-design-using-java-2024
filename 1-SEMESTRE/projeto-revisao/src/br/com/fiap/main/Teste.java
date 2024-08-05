package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		// colaborador
		
		System.out.println("*************************************************************");
		System.out.println("Dados do colaborador:");
		System.out.print("Código.................: ");
		colaborador.setCodigo(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Nome...................: ");
		colaborador.setNome(scanner.nextLine());
		System.out.print("Cargo..................: ");
		colaborador.setCargo(scanner.nextLine());
		System.out.print("Quantidade de horas....: ");
		colaborador.setQuantidaHoras(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Valor hora.............: ");
		colaborador.setValorHora(scanner.nextDouble());
		scanner.nextLine();
		System.out.println("Endereço do colaborador:");
		System.out.print("Logradouro.............: ");
		colaboradorEndereco.setLogradouro(scanner.nextLine());
		System.out.print("Número.................: ");
		colaboradorEndereco.setNumero(scanner.nextInt());
		scanner.nextLine();
		System.out.print("CEP....................: ");
		colaboradorEndereco.setCep(scanner.nextLine());
		System.out.print("Bairro.................: ");
		colaboradorEndereco.setBairro(scanner.nextLine());
		
		colaborador.setEndereco(colaboradorEndereco);
		
		System.out.println("*************************************************************"
				         + "\nDados do colaborador:"
				         + "\nCódigo...................: " + colaborador.getCodigo()
				         + "\nNome.....................: " + colaborador.getNome()
				         + "\nCargo....................: " + colaborador.getCargo()
				         + "\nQuantidade de horas......: " + colaborador.getQuantidaHoras()
				         + "\nValor hora...............: " + colaborador.getValorHora()
				         + "\nEndereço do colaborador:"
				         + "\nLogradouro...............: " + colaborador.getEndereco().getLogradouro()
				         + "\nNúmero...................: " + colaborador.getEndereco().getNumero()
				         + "\nCEP......................: " + colaborador.getEndereco().getCep()
				         + "\nBairro...................: " + colaborador.getEndereco().getBairro()
				         + "\n"
				         + "\nSALÁRIO DO COLABORADOR R$: " + colaborador.salario()
				         + "\n*************************************************************"
				         + "\n"
				         + "\n");
		
	
		
		// Empresa
		
		System.out.println("*************************************************************");
		System.out.println("Dados da Empresa:");
		System.out.println("CNPJ...................: ");
		empresa.setCnpj(scanner.nextLine());
		System.out.print("Razão Social...........: ");
		empresa.setRazaoSocial(scanner.nextLine());
		System.out.println("Endereço da Empresa:");
		System.out.print("Logradouro.............: ");
		empresaEndereco.setLogradouro(scanner.nextLine());
		System.out.print("Número.................: ");
		empresaEndereco.setNumero(scanner.nextInt());
		scanner.nextLine();
		System.out.print("CEP....................: ");
		empresaEndereco.setCep(scanner.nextLine());
		System.out.print("Bairro.................: ");
		empresaEndereco.setBairro(scanner.nextLine());
		
		empresa.setEndereco(empresaEndereco);
		
		System.out.println("*************************************************************"
				         + "\nDados da Empresa:"
				         + "\nCNPJ.......................: " + empresa.getCnpj()
				         + "\nRazão social...............: " + empresa.getRazaoSocial()
				         + "\nEndereço da Empresa:"
				         + "\nLogradouro...............: " + empresa.getEndereco().getLogradouro()
				         + "\nNúmero...................: " + empresa.getEndereco().getNumero()
				         + "\nCEP......................: " + empresa.getEndereco().getCep()
				         + "\nBairro...................: " + empresa.getEndereco().getBairro()
				         + "\n*************************************************************"
				         + "\n"
				         + "\n");
			
		scanner.close();

	}

}

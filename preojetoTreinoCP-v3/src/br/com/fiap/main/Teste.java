package br.com.fiap.main;

import java.util.Scanner;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class Teste {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador();
		Endereco colaboradorEndereco = new Endereco();
		
		Empresa empresa = new Empresa();
		Endereco empresaEndereco = new Endereco();
		
		Scanner scanner = new Scanner(System.in);
		
		// colaborador
		
		System.out.println("****Dados do colaborador****");
		System.out.print("Digite o código do colaborador..: ");
		colaborador.setCodigo(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Digite o nome do colaborador....: ");
		colaborador.setNome(scanner.nextLine());
		System.out.print("Digite o cargo do colaborador...: ");
		colaborador.setNome(scanner.nextLine());
		System.out.print("Digite o salário do colaborador.: ");
		colaborador.setSalario(scanner.nextDouble());
		scanner.nextLine();
		System.out.println("****Endereço do colaborador****");
		System.out.print("Digite o logradouro.............: ");
		colaboradorEndereco.setLogradouro(scanner.nextLine());
		System.out.print("Digite o número do logradouro...: ");
		colaboradorEndereco.setNumero(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Digite o CEP....................: ");
		colaboradorEndereco.setCep(scanner.nextLine());
		System.out.print("Digite o complemento............: ");
		colaboradorEndereco.setComplemento(scanner.nextLine());
		System.out.print("Digite o bairro.................: ");
		colaboradorEndereco.setBairro(scanner.nextLine());
		System.out.print("Digite a cidade.................: ");
		colaboradorEndereco.setCidade(scanner.nextLine());
		
		colaborador.setEndereco(colaboradorEndereco);
		
		System.out.println("****Dados do colaborador****"
				         + "\ncódigo..........................: " + colaborador.getCodigo()
				         + "\nNome............................: " + colaborador.getNome()
				         + "\nCargo...........................: " + colaborador.getCargo()
				         + "\nSalário.........................: " + colaborador.getSalario()
				         + "\n****Endereço do colaborador****"
				         + "\nLogradouro......................: " + colaborador.getEndereco().getLogradouro()
				         + "\nNúmero..........................: " + colaborador.getEndereco().getNumero()
				         + "\nCEP.............................: " + colaborador.getEndereco().getCep()
				         + "\nComplemento.....................: " + colaborador.getEndereco().getComplemento()
				         + "\nBairro..........................: " + colaborador.getEndereco().getBairro()
				         + "\nCidade..........................: " + colaborador.getEndereco().getCidade()
				         + "\n"
				         + "\n");
		
		// Empresa
		
		System.out.println("****Dados da Empresa****");
		System.out.print("Digite o CNPJ da empresa--------: ");
		empresa.setCnpj(scanner.nextLine());
		System.out.print("Digite a razão social da empresa: ");
		empresa.setRazaoSocial(scanner.nextLine());
		System.out.println("****Endereço da empresa****");
		System.out.print("Digite o logradouro da empresa--: ");
		empresaEndereco.setLogradouro(scanner.nextLine());
		System.out.print("Digite o número da empresa------: ");
		empresaEndereco.setNumero(scanner.nextInt());
		scanner.nextLine();
		System.out.print("Digite o CEP da empresa---------: ");
		empresaEndereco.setCep(scanner.nextLine());
		System.out.print("Digite o complemento da empresa-: ");
		empresaEndereco.setComplemento(scanner.nextLine());
		System.out.print("Digite o bairro da empresa------: ");
		empresaEndereco.setBairro(scanner.nextLine());
		System.out.print("Digite a cidade da empresa------: ");
		empresaEndereco.setCidade(scanner.nextLine());
		
		empresa.setEndereco(empresaEndereco);
		
		System.out.println("\n****Dados da empresa****"
				         + "\nCNPJ----------------------------: " + empresa.getCnpj()
				         + "\nRazão Social--------------------: " + empresa.getRazaoSocial()
				         + "\n****Endereço da empresa****"
				         + "\nLogradouro----------------------: " + empresa.getEndereco().getLogradouro()
				         + "\nNúmero--------------------------: " + empresa.getEndereco().getNumero()
				         + "\nCEP-----------------------------: " + empresa.getEndereco().getCep()
				         + "\nComplemento---------------------: " + empresa.getEndereco().getComplemento()
				         + "\nBairro--------------------------: " + empresa.getEndereco().getBairro()
				         + "\nCidade--------------------------: " + empresa.getEndereco().getCidade());
		
		scanner.close();

	}

}

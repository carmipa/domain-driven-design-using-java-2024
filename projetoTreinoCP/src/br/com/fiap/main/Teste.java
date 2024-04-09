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
		
		
		//colaborador.exibeMenu();
		//empresa.exibeMenu();
		
		// colaborador
		
		colaborador.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código do colaborador :")));
		colaborador.setNome(JOptionPane.showInputDialog("Nome do colaborador:"));
		colaborador.setCpf(JOptionPane.showInputDialog("CPF do colaborador:"));
		colaborador.setCargo(JOptionPane.showInputDialog("Cargo do colaborador:"));
		colaborador.setRenda(Double.parseDouble(JOptionPane.showInputDialog("Renda do colaborador:")));
		
		enderecoColaborador.setLogradouro(JOptionPane.showInputDialog("Logradouro do colaborador"));
		enderecoColaborador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número do colaborador:")));
		enderecoColaborador.setBairro(JOptionPane.showInputDialog("Bairro do colaborador:"));
		enderecoColaborador.setCep(JOptionPane.showInputDialog("CEP do colaborador:"));
		
		colaborador.setEndereco(enderecoColaborador); // adciona os enderecos do objetocolaborador dentro do objeto colaborador
		
		JOptionPane.showMessageDialog(null, "Dados do Colaborador:"
                + "\nCódigo do Colaborador------: " + colaborador.getCodigo()
                + "\nRenda do colaborador-------: " + colaborador.getRenda()
                + "\n"
                + "Endereço do colaborador:"
                + "\nLogradouro do colaborador--: " + enderecoColaborador.getLogradouro()
                + "\nNúmero do colaborador------: " + enderecoColaborador.getNumero()
                + "\nBairro do colaborador------: " + enderecoColaborador.getBairro()
                + "\nCEP------------------------: " + enderecoColaborador.getCep());
		
		//Empresa
		
		empresa.setCnpj(JOptionPane.showInputDialog("CNPJ da empresa:"));
		empresa.setRazaoSocial(JOptionPane.showInputDialog("Razão social da empresa:"));
		
		enderecoEmpresa.setLogradouro(JOptionPane.showInputDialog("Logradouro da empresa"));
		enderecoEmpresa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Número da empresa:")));
		enderecoEmpresa.setBairro(JOptionPane.showInputDialog("Bairro da empresa:"));
		enderecoEmpresa.setCep(JOptionPane.showInputDialog("CEP da empresa:"));
		
        JOptionPane.showMessageDialog(null, "Dados da empresa:"
                 + "\nCNPJ da empresa..........: " + empresa.getCnpj()
                 + "\nRazão social da empresa..: " + empresa.getRazaoSocial()
                 + "\n"
                 + "\nEndereço da empresa:"
                 + "\nLogradouro da empresa....: " + enderecoEmpresa.getLogradouro()
                 + "\nNúmero da empresa........: " + enderecoEmpresa.getNumero()
                 + "\nBairro da Empresa........: " + enderecoEmpresa.getBairro()
                 + "\nCEP da empresa...........: " + enderecoEmpresa.getCep());

	}

}

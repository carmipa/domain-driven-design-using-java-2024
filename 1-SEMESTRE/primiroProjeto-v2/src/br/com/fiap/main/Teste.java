package br.com.fiap.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o nome: ");
		cliente.setNome(scanner.nextLine());
		
		System.out.println("Digite a idade: ");
		cliente.setIdade(scanner.nextInt());
		
		System.out.println("Digite a altura: ");
		cliente.setAltura(scanner.nextDouble());
		
		System.out.println("\n.....................................................\n");
		
		System.out.println("Nome:.......: " + cliente.getNome() +
		                   "\nIdade:......: " + cliente.getIdade() + 
						   "\nAltura......: " + cliente.getAltura());
		
		
		
		
		

	}

}

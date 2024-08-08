package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setNome("Paulo");
		cliente.setIdade(44);
		cliente.setAltura(1.82);

		System.out.println("Nome do cliente....: " + cliente.getNome());
		System.out.println("Idade do cliente...: " + cliente.getIdade() + " anos");
		System.out.println("Altura do cliente..: " + cliente.getAltura());

	}

}

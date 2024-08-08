package br.com.fiap.clienteProduto.main;

import java.util.Scanner;

import br.com.fiap.clienteProduto.beans.Cliente;
import br.com.fiap.clienteProduto.beans.Endereco;
import br.com.fiap.clienteProduto.beans.Produto;

public class Teste {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		Endereco endereco = new Endereco();

		Cliente cliente = new Cliente();
		cliente.listaCliente();

		System.out.println("Dados do cliente");
		System.out.println("Nome do cliente....: ");
		cliente.setNome(leitura.nextLine());
		System.out.println("Idade do cliente...: ");
		cliente.setIdade(leitura.nextInt());
		System.out.println("Altura do cliente..: ");
		cliente.setAltura(leitura.nextDouble());

		Produto produto = new Produto();

		System.out.println("Dados do produto");
		System.out.println("Código do Produto..: ");
		produto.setCodigo(leitura.nextInt());
		System.out.println("Marca do produto...: ");
		produto.setMarca(leitura.nextLine());
		System.out.println("Tipo do produto....: ");
		produto.setTipo(leitura.nextLine());
		System.out.println("Valor do produto...: ");
		produto.setValor(leitura.nextDouble());

		System.out.println("Cliente");
		System.out.println("Nome.......: " + cliente.getNome());
		System.out.println("Idade......: " + cliente.getIdade());
		System.out.println("Altura.....: " + cliente.getAltura());

		System.out.println(".....................................");

		System.out.println("Produto");
		System.out.println("Código.....: " + produto.getCodigo());
		System.out.println("Marca......: " + produto.getMarca());
		System.out.println("Tipo.......: " + produto.getTipo());
		System.out.println("Valor......: " + produto.getValor());

	}

}

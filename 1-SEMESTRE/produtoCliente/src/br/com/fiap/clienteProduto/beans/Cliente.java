package br.com.fiap.clienteProduto.beans;

public class Cliente {

	private String nome;
	private int idade;
	private double altura;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void listaCliente() {
		System.out.println("Cliente");
		System.out.println("Nome.......: " + nome);
		System.out.println("Idade......: " + idade);
		System.out.println("Altura.....: " + altura);
	}

}

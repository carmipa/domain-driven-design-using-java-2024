package br.com.fiap.beans;

public class Moto extends Veiculo {

	private String guidao;

	// metodo construtor vazio

	public Moto() {
		super();

	}

	// metodo construtor cheio com herança

	public Moto(String placa, String marca, String modelo, int ano, double valor, String guidao) {
		super(placa, marca, modelo, ano, valor);
		this.guidao = guidao;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	@Override
	public String toString() {
		return "Moto:" + guidao + "\nGuidao=" + getGuidao() + "\nPlaca=" + getPlaca()
				+ "\nMarca=" + getMarca() + "\nModelo=" + getModelo() + "\nAno=" + getAno()
				+ "\nValor=" + getValor();
	}

}

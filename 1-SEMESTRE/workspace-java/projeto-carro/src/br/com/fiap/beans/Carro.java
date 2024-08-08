package br.com.fiap.beans;

public class Carro extends Veiculo {

	private String volante;

	public Carro() {
		super();

	}

	public Carro(String placa, String marca, String modelo, int ano, double valor, String volante) {
		super(placa, marca, modelo, ano, valor);
		this.volante = volante;
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}

	@Override
	public String toString() {
		return "Carro:" + volante + "\nVolante=" + getVolante() + "\nPlaca=" + getPlaca()
				+ "\nMarca=" + getMarca() + "\nModelo=" + getModelo() + "\nAno=" + getAno()
				+ "\nValor=" + getValor();
	}

	
	
}

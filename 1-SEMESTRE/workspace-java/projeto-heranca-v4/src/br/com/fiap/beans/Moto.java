package br.com.fiap.beans;

import java.beans.JavaBean;

@JavaBean
public class Moto extends Veiculo {

	private String guidao;

	public Moto() {
		super();
	}

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
		return "Moto [getGuidao()=" + getGuidao() + ", getPlaca()=" + getPlaca() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAno()=" + getAno() + ", getValor()=" + getValor() + "]";
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return 	"INFORMAÇÕES DA MOTO:";
	}

}

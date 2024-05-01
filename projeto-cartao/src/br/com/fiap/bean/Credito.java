package br.com.fiap.bean;

public class Credito extends Cartao {

	public Credito() {
		super();

	}

	public Credito(String banco, String bandeira, String validade, int cvv, int numero, double saldo, double compra) {
		super(banco, bandeira, validade, cvv, numero, saldo, compra);

	}

	@Override
	public double limite() {
		
		return saldo + (30 * saldo / 100);
	}

}
